package Inheritance;

public class Pigeon extends Bird{
    private int carHits;
    private int peopleHits;
    private float overallPoopAccuracy;

    public int getCarHits() {
        return carHits;
    }
    public void setCarHits(int carHits) {
        this.carHits = carHits;
    }
    public int getPeopleHits() {
        return peopleHits;
    }
    public void setPeopleHits(int peopleHits) {
        this.peopleHits = peopleHits;
    }
    public float getOverallPoopAccuracy() {
        return overallPoopAccuracy;
    }
    public void setOverallPoopAccuracy(float overallPoopAccuracy) {
        this.overallPoopAccuracy = overallPoopAccuracy;
    }

    public Pigeon(){}
    public Pigeon(String featherColor, boolean canFly, int carHits, int peopleHits, float overallPoopAccuracy) {
        super(featherColor, canFly);
        this.carHits = carHits;
        this.peopleHits = peopleHits;
        this.overallPoopAccuracy = overallPoopAccuracy;
    }
    public Pigeon(String name, int age, int weight, String featherColor, boolean canFly, int carHits, int peopleHits, float overallPoopAccuracy) {
        super(name, age, weight, featherColor, canFly);
        this.carHits = carHits;
        this.peopleHits = peopleHits;
        this.overallPoopAccuracy = overallPoopAccuracy;
    }

    public void eat(){
        System.out.println("The pigeon is eating some bread crumbs");
    }
    public void getVoice(){
        System.out.println("The pigeon makes a muffled BRRRUGH sound");
    }

    public String toString() {
        return "Pigeon{" +
                "carHits=" + carHits +
                ", peopleHits=" + peopleHits +
                ", overallPoopAccuracy=" + overallPoopAccuracy +
                '}';
    }
}
