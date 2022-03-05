# DesignPattern_Study_Builder

# Notion Link
https://five-cosmos-fb9.notion.site/Builder-d5a74c9bb2fb430fa77278a9e6598ece


# 빌더 (Builder)

`**복잡한 단계**`가 필요한 인스턴스 생성을 빌더 패턴을 통해서 구현할 수 있다.

**`복잡한 단계`를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴으로 볼 수 있다.**

<aside>
💡 사전적 의미 (Builder)
- 건축 업자, 시공자, 건조자
- (새 국가 등의) 건설자

</aside>

즉, 간단하게 생성할 수 있는 객체가 아니라 복잡하게 생성되는 객체를 서브 클래스로 위임하여 객체의 생성을 단순화 할 수 있다.

**예를 들어, 팩토리 패턴이나 추상 팩토리 패턴에서는 생성해야 하는 클래스에 대한 속성 값이 많을 때 아래와 같은 여러 이슈들이 있다.**

1. 클라이언트 프로그램으로부터 팩토리 클래스로 많은 파라미터를 넘겨줄 때 타입, 순서등에 대한 관리가 어려워져 에러 발생 확률이 올라간다.
2. 경우에 따라 필요 없는 파라미터들에 대해서 팩토리 클래스에 일일이 null 값을 지정해줘야 한다.
3. 생성해야 하는 Sub Class가 무거워지고 복잡해짐에 따라 팩토리 클래스 또한 복잡해진다.

**이러한 문제점들을 해결하기 위해 빌더패턴은**

별도의 Builder 클래스를 만들어 필수 값에 대해서는 생성자를 통해 전달받고

선택적인 값들에 대해서는 메소드를 통해 step-by-step의 형태로 입력받아 최종적인 하나의 인스턴스를 반환한다.

### **기본 설계**

- 기본적인 다이어그램이며 응용해서 다양하게 활용해낼 수 있다.

![image](https://user-images.githubusercontent.com/18654358/156861287-4c80fa19-8b4f-46ba-856b-8d8ff1c01ab1.png)

### 참여자

**Builder** 

- Product 객체의 일부 요소들을 생성하기 위한 추상 인터페이스를 정의

**ConcreateBuilder**

- Builder 클래스에 정의된 인터페이스를 구현하며, 제품의 부품들을 모아 빌더를 복합한다.
- 생성한 요소의 표현을 정의하고 관리한다.
- 제품을 검색하는데 필요한 인터페이스를 제공한다.

**Director**

- Builder 인터페이스를 사용하는 객체

**Product**

- 생성할 복합 객체를 표현
- ConcreateBuilder는 제품의 내부 표현을 구축하고 복합 객체가 어떻게 구성되는지에 관한 절차를 정의

![image](https://user-images.githubusercontent.com/18654358/156861297-82099930-fe88-4a4a-9586-f6434ea64de0.png)

### 결과

**제품에 대한 내부 표현을 다양하게 변화할 수 있다.**

- Builder 객체는 디렉터를 제공하고 제품을 복합하기 위해 필요한 추상 인터페이스를 정의
- 빌더를 사용하면 제품이 어떤 요소에서 복합되는지, 그리고 각 요소들으 ㅣ표현 방법이 무엇인지 가릴 수 있게 된다.
- 즉, 어떤 요소로 전체 제품을 복합하고 그 요소들이 어떤 타입들로 구성되어 있는지 알고 있는 쪽은 빌더 뿐이다.
- 제품을 복합할 때는 빌더에 정의된 추상 인터페이스를 통해 사용자가 동장하기 때문에
- 새로운 제품의 표현 방법이나 제품의 복합 방법이 바뀔 때 추상 인터페이스를 정의한 Builder 클래스에서 상속을 통해 새로운 서브 클래스를 정의하면 된다.

**생성과 표현에 필요한 코드를 분리**

- 복합객체를 생성하고 복합 객체의 내부 표현 방법을 별도의 모듈로 정의할 수 있다.
- 사용자는 제품의 내부 구조를 정의한 클래스는 전혀 모른 채, 빌더와 상호작용을 통해 필요한 복합 객체를 생성하게 된다.

**복합 객체를 생성하는 절차를 좀 더 세밀하게 나눌 수 있다.**

- 한번에 복합 객체를 생성하는 것 처럼
- **`빌더 패턴은 디렉터의 통제 아래 하나씩 내부 구성요소들을 만들어 나간다.`**
- **`디렉터가 빌더에서 만든 전체 복합 객체를 돌려받을 때 까지 제품 복합의 과정은 계속된다.`**
- 그렇기 때문에 Builder 클래스의 인터페이스에는 이 제품을 생성하는 과정 자체가 반영되어 있다.
- BuildPart() 메서드를 통해 그 과정을 확인할 수 있다.

---

## 정리

복잡한 객체 생성 → 추상 팩토리, 빌더 두가지 패턴은 비슷한 모습을 보인다.

근본적으로 차이를 본다면

**`빌더 패턴`은 복잡한 객체의 단계별 생성에 중점을 둔다.**

**`추상 팩토리` 패턴은 제품의 유사군들이 존재할 때 유연한 설계에 중점을 둔다.**

**빌더 패턴**은 생성의 **마지막 단계**에서 생성한 제품을 반환한다.

**추상 팩토리** 패턴은 **만드는 즉시** 제품을 반환한다.

---

---

### 빌더패턴을 이용하여 Champion 객체를 생성해보자.

[Main.java](http://Main.java) 

- 빌더패턴을 이용해 객체를 생성하는 Client 코드

```java
import builder.Champion;
import builder.ZileanBuilder;
import builder.ZinxBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");

				// 1
        ChampionFactory factory = new ChampionFactory();

				// 2
        factory.setChampionBuilder(new ZinxBuilder());

				// 3
        factory.make();

				// 4
        Champion zinx = factory.getChampion();
        System.out.println("zinx : " + zinx.toString());

        factory.setChampionBuilder(new ZileanBuilder());
        factory.make();

        Champion zilean = factory.getChampion();
        System.out.println("zilean : " + zilean.toString());
    }
}
```

```java
zinx : Champion{name='징크스', qSkill='징크스 Q', wSkill='징크스 W', eSkill='징크스 E', rSkill='징크스 R', defaultPassive='징크스 기본 패시브', specialPassive='징크스 전용 패시브'}
zilean : Champion{name='질리언', qSkill='질리언 Q', wSkill='질리언 W', eSkill='질리언 E', rSkill='질리언 R', defaultPassive='질리언 기본 패시브', specialPassive='질리언 전용 패시브'}
```

1. 객체를 생성하기 위한 Factory 선언 (`Director`)
2. Factory에 어떤 방법으로 객체를 생성할 것인지 Builder 객체 전달 (`ConcreateBuilder`)
3. make (`BuildPart#()`)
4. 생성된 객체를 반환 (`GetResult`)

**ChampionBuilder (abstract)**

- Champion 객체를 생성하기 위해 필요한 내용을 정의

```java
package builder;

public abstract class ChampionBuilder {

    abstract public void setName();

    abstract public void setQSkill();
    abstract public void setWSkill();
    abstract public void setESkill();
    abstract public void setRSkill();

    abstract public void setDefaultPassive();
    abstract public void setSpecialPassive();

    abstract public Champion getChampion();
}
```

**ZinxChampionBuilder, ZileanChampionBuilder**

- extends ChampionBuilder

```java
package builder;

public class ZinxBuilder extends ChampionBuilder{

    private Champion champion;

    public ZinxBuilder(){
        champion = new Champion();
    }

    @Override
    public void setName() {
        this.champion.setName("징크스");
    }

    @Override
    public void setQSkill() {
        this.champion.setqSkill("징크스 Q");
    }

    @Override
    public void setWSkill() {
        this.champion.setwSkill("징크스 W");
    }

    @Override
    public void setESkill() {
        this.champion.seteSkill("징크스 E");
    }

    @Override
    public void setRSkill() {
        this.champion.setrSkill("징크스 R");
    }

    @Override
    public void setDefaultPassive() {
        this.champion.setDefaultPassive("징크스 기본 패시브");
    }

    @Override
    public void setSpecialPassive() {
        this.champion.setSpecialPassive("징크스 전용 패시브");
    }

    @Override
    public Champion getChampion() {
        return this.champion;
    }

}
```

```java
package builder;

public class ZileanBuilder extends ChampionBuilder {

    private Champion champion;

    public ZileanBuilder(){
        champion = new Champion();
    }

    @Override
    public void setName() {
        this.champion.setName("질리언");
    }

    @Override
    public void setQSkill() {
        this.champion.setqSkill("질리언 Q");
    }

    @Override
    public void setWSkill() {
        this.champion.setwSkill("질리언 W");
    }

    @Override
    public void setESkill() {
        this.champion.seteSkill("질리언 E");
    }

    @Override
    public void setRSkill() {
        this.champion.setrSkill("질리언 R");
    }

    @Override
    public void setDefaultPassive() {
        this.champion.setDefaultPassive("질리언 기본 패시브");
    }

    @Override
    public void setSpecialPassive() {
        this.champion.setSpecialPassive("질리언 전용 패시브");
    }

    @Override
    public Champion getChampion() {
        return this.champion;
    }

}
```

**정의된 Builder를 이용해 객체를 생성할 Factory**

```java
import builder.Champion;
import builder.ChampionBuilder;

public class ChampionFactory {

    private ChampionBuilder builder;

    public void setChampionBuilder(ChampionBuilder builder) {
        this.builder = builder;
    }

    public void make() {
        this.builder.setName();
        this.builder.setQSkill();
        this.builder.setWSkill();
        this.builder.setESkill();
        this.builder.setRSkill();

        this.builder.setDefaultPassive();
        this.builder.setSpecialPassive();
    }

    public Champion getChampion() {
        if(this.builder.getChampion() == null){
            throw new IllegalStateException("not created champion");
        }
        return this.builder.getChampion();
    }
}
```

---

---

`**많은 변수`를 가진 객체의 생성을 가독성 높도록 코딩할 수 있다.**

- Lombok의 @Builder 애노테이션

Main.java

- 메소드 체인 방식을 활용하여 많은 변수를 가진 객체 생성을 가독성 높게 만들어 낸다.

```java
Champion joy = JoyBuilder.builder()
                         .setName("조이")
                         .setQSkill("조이 Q")
                         .setWSkill("조이 W")
                         .setESkill("조이 E")
                         .setRSkill("조이 R")
                         .setDefaultPassive("조이 기본 패시브")
                         .setSpecialPassive("조이 전용 패시브")
                         .build();

System.out.println("joy : " + joy.toString());
```

```java
joy : Champion{name='조이', qSkill='조이 Q', wSkill='조이 W', eSkill='조이 E', rSkill='조이 R', defaultPassive='조이 기본 패시브', specialPassive='조이 전용 패시브'}
```

**JoyBuilder.java**
