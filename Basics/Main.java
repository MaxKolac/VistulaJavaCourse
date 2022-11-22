package Basics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HelloWorld.main(args);
        Instructions.simpleCalculator(reader);
        Instructions.bmiCalculator(reader);
        Instructions.rootCalculator(reader);
        Instructions.sumOfAllEvenNumbers(reader);
        Instructions.findMinMaxOutOfRandom(reader);
    }
}
