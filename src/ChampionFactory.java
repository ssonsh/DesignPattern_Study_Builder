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
