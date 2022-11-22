package Basics;
import java.math.BigDecimal;
import java.util.Random;

public class VariableTypes {
    public static void main(String[] args){
        WeightOnMars();
        EvenOdd();
        LegoBricks();
        HowToNotCalculateYourTaxes();
    }
    public static void WeightOnMars(){
        float earthWeightKolacinski = 88F;
        float marsWeightKolacinski = earthWeightKolacinski * 0.38F;
        double marsWeightAsDoubleKolacinski = marsWeightKolacinski;
        int marsWeightAsIntKolacinski = (int)marsWeightAsDoubleKolacinski;
        char marsWeightAsCharKolacinski = (char)marsWeightAsIntKolacinski;
        int marsWeightAsAnotherIntKolacinski = marsWeightAsCharKolacinski + marsWeightAsIntKolacinski + 40;

        System.out.println("Your mass on Earth in float: " + earthWeightKolacinski);
        System.out.println("Your mass on Mars in float: " + marsWeightKolacinski);
        System.out.printf("Your mass on Mars in double: %.4f %n", marsWeightAsDoubleKolacinski);
        System.out.println("Your mass on Mars in integer: " + marsWeightAsIntKolacinski);
        System.out.println("Your mass on Mars as char:" + marsWeightAsCharKolacinski);
        System.out.println("Your weight as char after operation: " + marsWeightAsAnotherIntKolacinski);
    }

    public static void EvenOdd(){
        Random rnd = new Random();
        for (int i = 0; i < 5; i++){
            int randomNumber = rnd.nextInt(0, 100);
            if (randomNumber % 2 == 0) System.out.println( randomNumber + " is even.");
            else System.out.println( randomNumber + " is odd.");
        }
    }

    public static void LegoBricks(){
        Random rnd = new Random();
        int legoBricks = rnd.nextInt(50, 99);
        int boxCapacity = rnd.nextInt(5, 10);
        int filledUpBoxes;
        int requiredBoxes;
        int leftOverBricks;

        if (legoBricks % 2 == 0) legoBricks++;
        if (boxCapacity % 2 != 0) boxCapacity++;

        filledUpBoxes = legoBricks / boxCapacity;
        leftOverBricks = legoBricks % boxCapacity;
        if (leftOverBricks > 0) requiredBoxes = filledUpBoxes + 1; else requiredBoxes = filledUpBoxes;

        System.out.println("We have a total of " + legoBricks + " LEGO bricks and multiple boxes, each with capacity of " + boxCapacity + " of LEGO bricks.");
        System.out.print("We can completely fill " + filledUpBoxes + " boxes with LEGO bricks. \nThe last additional partially filled box will have " + leftOverBricks);
        if (leftOverBricks == 1) System.out.println(" brick."); else System.out.println(" bricks.");
        if (leftOverBricks > 0) System.out.println("The total amount of boxes required is " + requiredBoxes);
    }

    public static void HowToNotCalculateYourTaxes() {
        double nettoPrice = 9.99D;
        double bruttoPrice = nettoPrice * 1.23D;
        int amountSold = 1_992_213;

        double totalProfitAsDouble = bruttoPrice * amountSold;
        BigDecimal totalProfitAsBigDecimal = new BigDecimal(bruttoPrice * amountSold);

        System.out.println("Total profit from selling " + amountSold + " products, " + bruttoPrice + " brutto per product (" + nettoPrice + " netto price + 23% VAT tax):");
        System.out.println(" - as double:     " + totalProfitAsDouble);
        System.out.println(" - as BigDecimal: " + totalProfitAsBigDecimal);
    }
}
