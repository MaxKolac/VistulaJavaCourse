package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void Zadanie1A(int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            counter++;
            System.out.println(Arrays.toString(numbers));
            System.out.println();
            if (numbers[i] > numbers[i + 1]) {
                counter++;
                int placeholder = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = placeholder;
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Ilość operacji: " + counter);
    }

    public static void Zadanie1B(int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            counter++;
            System.out.println(Arrays.toString(numbers));
            System.out.println();
            for (int j = 0; j < numbers.length - 1; j++) {
                counter++;
                if (numbers[j] > numbers[j + 1]) {
                    counter++;
                    int placeholder = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = placeholder;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Ilość operacji: " + counter);
    }

    public static void Zadanie1C(int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            counter++;
            System.out.println(Arrays.toString(numbers));
            System.out.println();
            for (int j = 0; j < numbers.length - i; j++){
                counter++;
                int placeholder = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = placeholder;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Ilość operacji: " + counter);
    }

    public static void Zadanie1D(int[] numbers){
        int counter = 0;
        boolean keepSorting = true;
        for (int i = 0; i < numbers.length - 1 && keepSorting; i++){
            keepSorting = false;
            counter++;
            System.out.println(Arrays.toString(numbers));
            System.out.println();
            for (int j = 0; j < numbers.length - i - 1; j++) {
                counter++;
                keepSorting = false;
                if (numbers[j] > numbers[j + 1]) {
                    keepSorting = true;
                    counter++;
                    int placeholder = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = placeholder;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Ilość operacji: " + counter);
    }
}
