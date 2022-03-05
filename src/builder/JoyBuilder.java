package builder;

public class JoyBuilder {

    private Champion champion;

    public JoyBuilder(){
        this.champion = new Champion();
    }
    public static JoyBuilder builder() {
        return new JoyBuilder();
    }


    public JoyBuilder setName(String name) {
        this.champion.setName(name);
        return this;
    }

    public JoyBuilder setQSkill(String qSkill) {
        this.champion.setqSkill(qSkill);
        return this;
    }
    public JoyBuilder setWSkill(String wSkill) {
        this.champion.setwSkill(wSkill);
        return this;
    }
    public JoyBuilder setESkill(String eSkill) {
        this.champion.seteSkill(eSkill);
        return this;
    }
    public JoyBuilder setRSkill(String rSkill) {
        this.champion.setrSkill(rSkill);
        return this;
    }

    public JoyBuilder setDefaultPassive(String defaultPassive) {
        this.champion.setDefaultPassive(defaultPassive);
        return this;
    }
    public JoyBuilder setSpecialPassive(String specialPassive) {
        this.champion.setSpecialPassive(specialPassive);
        return this;
    }

    public Champion build() {
        return this.champion;
    }
}
