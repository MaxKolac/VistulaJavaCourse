package Basics;
import java.io.BufferedReader;
import java.util.Random;

public class Instructions {
    public static void simpleCalculator(BufferedReader reader){
        float first57527Kolacinski;
        float second57527Kolacinski;

        try {
            System.out.print("Input the first number: ");
            first57527Kolacinski = Float.parseFloat(reader.readLine());
            System.out.print("Input the second number: ");
            second57527Kolacinski = Float.parseFloat(reader.readLine());

            float addition = first57527Kolacinski + second57527Kolacinski;
            float subtraction = first57527Kolacinski - second57527Kolacinski;
            float multiplication = first57527Kolacinski * second57527Kolacinski;
            float division = first57527Kolacinski / second57527Kolacinski;

            System.out.println("Two input values were: " + first57527Kolacinski + " and " + second57527Kolacinski + ".");
            System.out.printf("Addition: %.2f%n", addition);
            System.out.printf("Subtraction: %.2f%n", subtraction);
            System.out.printf("Multiplication: %.2f%n", multiplication);
            System.out.printf("Division: %.2f%n", division);
            System.out.println();
        }
        catch (Exception e){
            System.out.printf("Error: " + e);
        }
    }

    public static void bmiCalculator(BufferedReader reader){
        float heightKolacinski;
        float weightKolacinski;

        try {
            System.out.println();
            System.out.print("Input your height in meters: ");
            heightKolacinski = Float.parseFloat(reader.readLine());
            System.out.print("Input your height in kilograms: ");
            weightKolacinski = Float.parseFloat(reader.readLine());

            double bmiKolacinski = weightKolacinski / Math.pow(heightKolacinski, 2D);
            String bmiResultKolacinski;

            if (bmiKolacinski < 16D) bmiResultKolacinski = "Wygłodzenie";
            else if (bmiKolacinski >= 16D && bmiKolacinski < 16.99D) bmiResultKolacinski = "Wychudzenie";
            else if (bmiKolacinski >= 17D && bmiKolacinski < 18.49D) bmiResultKolacinski = "Niedowaga";
            else if (bmiKolacinski >= 18.50D && bmiKolacinski < 22.99D) bmiResultKolacinski = "Norma niski przedział";
            else if (bmiKolacinski >= 23D && bmiKolacinski < 24.99D) bmiResultKolacinski = "Norma wysoki przedział";
            else if (bmiKolacinski >= 25D && bmiKolacinski < 27.49D) bmiResultKolacinski = "Nadwaga niski przedział";
            else if (bmiKolacinski >= 27.5D && bmiKolacinski < 29.99D) bmiResultKolacinski = "Nadwaga wysoki przedział";
            else if (bmiKolacinski >= 30D && bmiKolacinski < 34.9D) bmiResultKolacinski = "Otyłość I stopnia";
            else if (bmiKolacinski >= 35D && bmiKolacinski < 39.9D) bmiResultKolacinski = "Otyłość II stopnia";
            else bmiResultKolacinski = "Otyłość III stopnia";

            System.out.printf("Twój wskaźnik BMI: %.2f - " + bmiResultKolacinski, bmiKolacinski);
        }
        catch (Exception e){
            System.out.printf("Error: " + e);
        }
    }

    public static void rootCalculator(BufferedReader reader){
        float aKolacinski, bKolacinski, cKolacinski;

        try {
            System.out.println();
            System.out.print("Input the function's A value: ");
            aKolacinski = Float.parseFloat(reader.readLine());
            System.out.print("Input the function's B value: ");
            bKolacinski = Float.parseFloat(reader.readLine());
            System.out.print("Input the function's C value: ");
            cKolacinski = Float.parseFloat(reader.readLine());

            if (aKolacinski == 0) {
                System.out.print("Value A cannot equal to zero.");
                return;
            }

            double deltaKolacinski = Math.pow(bKolacinski, 2) - (4D * aKolacinski * cKolacinski);
            double x1Kolacinski, x2Kolacinski;
            int rootAmount;

            if (deltaKolacinski < 0) rootAmount = 0;
            else if (deltaKolacinski == 0) rootAmount = 1;
            else rootAmount = 2;

            System.out.printf("Delta: %.2f %n", deltaKolacinski);
            switch (rootAmount){
                case 0:
                    System.out.println("This function has no roots.");
                    break;
                case 1:
                    x1Kolacinski = (- bKolacinski) / (2D * aKolacinski);
                    System.out.printf("This function has only 1 root: %.2f", x1Kolacinski);
                    break;
                case 2:
                    x1Kolacinski = (- bKolacinski - Math.sqrt(deltaKolacinski)) / (2D * aKolacinski);
                    x2Kolacinski = (- bKolacinski + Math.sqrt(deltaKolacinski)) / (2D * aKolacinski);
                    System.out.printf("This function has 2 roots: %.2f and %.2f", x1Kolacinski, x2Kolacinski);
            }
        }
        catch (Exception e){
            System.out.printf("Error: " + e);
        }
    }

    public static void sumOfAllEvenNumbers(BufferedReader reader){
        int sumKolacinski = 0;
        for (int i = 1; i < 101; i++){
            if (i % 2 == 0) sumKolacinski += i;
        }
        System.out.println("Sum of all even numbers between 1 and 100 is " + sumKolacinski);
    }

    public static void findMinMaxOutOfRandom(BufferedReader reader){
        Random random = new Random();
        int[] randomNumbersKolacinski = new int[10];
        int highestNumberKolacinski = 0, lowestNumberKolacinski = 101, i;

        for (i = 0; i < 10; i++) randomNumbersKolacinski[i] = random.nextInt(1, 101);

        i = 0;
        while (i < randomNumbersKolacinski.length){
            if (randomNumbersKolacinski[i] > highestNumberKolacinski) highestNumberKolacinski = randomNumbersKolacinski[i];
            if (randomNumbersKolacinski[i] < lowestNumberKolacinski) lowestNumberKolacinski = randomNumbersKolacinski[i];
            i++;
        }

        System.out.println("Ten random numbers generated: ");
        for (i = 0; i < randomNumbersKolacinski.length; i++)
            System.out.print(randomNumbersKolacinski[i] + " ");
        System.out.println();
        System.out.println("Highest number: " + highestNumberKolacinski);
        System.out.println("Lowest number: " + lowestNumberKolacinski);
    }
}
