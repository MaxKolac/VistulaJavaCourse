package Inheritance;

public class Mammal extends Animal {
    private boolean hasFur;
    private int legs;

    public boolean isHasFur() {
        return hasFur;
    }
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    Mammal(){}
    public Mammal(boolean hasFur, int legs) {
        this.hasFur = hasFur;
        this.legs = legs;
    }
    public Mammal(String name, int age, int weight, boolean hasFur, int legs) {
        super(name, age, weight);
        this.hasFur = hasFur;
        this.legs = legs;
    }

    public String toString() {
        return "Mammal{" +
                "hasFur=" + hasFur +
                ", legs=" + legs +
                '}';
    }
}
