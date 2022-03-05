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
