package builder;

public class Champion {

    private String name;

    private String qSkill;
    private String wSkill;
    private String eSkill;
    private String rSkill;

    private String defaultPassive;
    private String specialPassive;

    public Champion(){

    }

    public Champion(String name,
                    String qSkill,
                    String wSkill,
                    String eSkill,
                    String rSkill,
                    String defaultPassive,
                    String specialPassive) {
        this.name = name;
        this.qSkill = qSkill;
        this.wSkill = wSkill;
        this.eSkill = eSkill;
        this.rSkill = rSkill;
        this.defaultPassive = defaultPassive;
        this.specialPassive = specialPassive;
    }

    @Override
    public String toString() {
        return "Champion{" +
               "name='" + name + '\'' +
               ", qSkill='" + qSkill + '\'' +
               ", wSkill='" + wSkill + '\'' +
               ", eSkill='" + eSkill + '\'' +
               ", rSkill='" + rSkill + '\'' +
               ", defaultPassive='" + defaultPassive + '\'' +
               ", specialPassive='" + specialPassive + '\'' +
               '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setqSkill(String qSkill) {
        this.qSkill = qSkill;
    }

    public void setwSkill(String wSkill) {
        this.wSkill = wSkill;
    }

    public void seteSkill(String eSkill) {
        this.eSkill = eSkill;
    }

    public void setrSkill(String rSkill) {
        this.rSkill = rSkill;
    }

    public void setDefaultPassive(String defaultPassive) {
        this.defaultPassive = defaultPassive;
    }

    public void setSpecialPassive(String specialPassive) {
        this.specialPassive = specialPassive;
    }

    public String getName() {
        return name;
    }

    public String getqSkill() {
        return qSkill;
    }

    public String getwSkill() {
        return wSkill;
    }

    public String geteSkill() {
        return eSkill;
    }

    public String getrSkill() {
        return rSkill;
    }

    public String getDefaultPassive() {
        return defaultPassive;
    }

    public String getSpecialPassive() {
        return specialPassive;
    }
}
