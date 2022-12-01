package Interfaces;

public class Fish extends Animal implements AnimalMove, AnimalBehavior{
    private String preferredWaterType;
    private boolean dangerous;

    public String getPreferredWaterType() {
        return preferredWaterType;
    }
    public void setPreferredWaterType(String preferredWaterType) {
        this.preferredWaterType = preferredWaterType;
    }
    public boolean isDangerous() {
        return dangerous;
    }
    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public Fish(){}
    public Fish(String preferredWaterType, boolean dangerous) {
        this.preferredWaterType = preferredWaterType;
        this.dangerous = dangerous;
    }
    public Fish(String name, int age, int weight, String preferredWaterType, boolean dangerous) {
        super(name, age, weight);
        this.preferredWaterType = preferredWaterType;
        this.dangerous = dangerous;
    }

    public String toString() {
        return "Fish{" +
                "preferredWaterType='" + preferredWaterType + '\'' +
                ", dangerous=" + dangerous +
                '}';
    }

    @Override
    public void sleep() {}
}
