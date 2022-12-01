package Interfaces;

public class Blowfish extends Fish implements AnimalMove, AnimalBehavior{
    private boolean isPuffed;

    public boolean isPuffed() {
        return isPuffed;
    }
    public void setPuffed(boolean puffed) {
        isPuffed = puffed;
    }

    public Blowfish() {}
    public Blowfish(String preferredWaterType, boolean dangerous, boolean isPuffed) {
        super(preferredWaterType, dangerous);
        this.isPuffed = isPuffed;
    }
    public Blowfish(String name, int age, int weight, String preferredWaterType, boolean dangerous, boolean isPuffed) {
        super(name, age, weight, preferredWaterType, dangerous);
        this.isPuffed = isPuffed;
    }

    public void eat(){
        System.out.println("The blowfish is eating fishfood.");
    }
    public void getVoice(){
        System.out.println("Dzieci i ryby głosu nie mają :P");
    }

    public String toString() {
        return "Blowfish{" +
                "isPuffed=" + isPuffed +
                '}';
    }

    public void sleep(){
        System.out.println("The blowfish is sleeping between the corals and rocks");
    }
    public void move(){ System.out.println("The blowfish is swimming through water"); }
}
