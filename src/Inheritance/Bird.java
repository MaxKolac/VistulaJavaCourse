package Inheritance;

public class Bird extends Animal{
    private String featherColor;
    private boolean canFly;

    public String getFeatherColor() {
        return featherColor;
    }
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    public boolean isCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird(){}
    public Bird(String featherColor, boolean canFly) {
        this.featherColor = featherColor;
        this.canFly = canFly;
    }
    public Bird(String name, int age, int weight, String featherColor, boolean canFly) {
        super(name, age, weight);
        this.featherColor = featherColor;
        this.canFly = canFly;
    }

    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
