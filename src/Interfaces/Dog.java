package Interfaces;

public class Dog extends Mammal implements AnimalMove, AnimalBehavior{
    private String size;
    private String breed;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(){}
    public Dog(boolean hasFur, int legs, String size, String breed) {
        super(hasFur, legs);
        this.size = size;
        this.breed = breed;
    }
    public Dog(String name, int age, int weight, boolean hasFur, int legs, String size, String breed) {
        super(name, age, weight, hasFur, legs);
        this.size = size;
        this.breed = breed;
    }

    public void eat(){
        System.out.println("The dog is eating dogfood.");
    }
    public void getVoice(){
        System.out.println("The dog makes a BARK! noise.");
    }

    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void move() { System.out.println("The dog is running in the park"); }
    public void sleep() { System.out.println("The dog is sleeping in its doghouse."); }
}
