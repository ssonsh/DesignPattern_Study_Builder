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
