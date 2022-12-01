package Interfaces;

public interface AnimalMove {
    default void move(){
        System.out.println("The animal is moving");
    }

}
