package Basics;

import java.util.Random;
public class Loops {
    public static void RandomNumbersArray(){
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(0, 11);
        }

        int j = 0;
        for (int i: array) {
            System.out.printf("array[%s] = %s%n", j, i);
            j++;
        }
    }

    public static void MinMaxInArray(){
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++){
            array[0] = rnd.nextInt(0, 101);
        }

        int min = 100, max = 0;
        for (int i = 0; i < 10; i++){
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
        }

        for (int i: array) {
            System.out.printf("%s%n", i);
        }
    }

    public static void Matrix(){
        int[][] matrix = new int[10][10];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i == j) matrix[i][j] = i;
                else matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}