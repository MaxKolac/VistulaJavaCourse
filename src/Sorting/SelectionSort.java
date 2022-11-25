package Sorting;

public class SelectionSort {
    public static void Zadanie2A(int[] numbers){
        int min = 0, i = 0, counter = 0, k, temp;

        for (i = 0; i < numbers.length - 1; i++){
            counter++;
            min = i;
            for (k = i + 1; k < numbers.length; k++){
                counter++;
                if (numbers[k] < numbers[min]){
                    counter++;
                    min = k;
                }
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }
}
