import builder.Champion;
import builder.JoyBuilder;
import builder.ZileanBuilder;
import builder.ZinxBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");

        ChampionFactory factory = new ChampionFactory();
        factory.setChampionBuilder(new ZinxBuilder());
        factory.make();

        Champion zinx = factory.getChampion();
        System.out.println("zinx : " + zinx.toString());


        factory.setChampionBuilder(new ZileanBuilder());
        factory.make();

        Champion zilean = factory.getChampion();
        System.out.println("zilean : " + zilean.toString());


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

    }
}
