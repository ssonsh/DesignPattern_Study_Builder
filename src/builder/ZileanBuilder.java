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
