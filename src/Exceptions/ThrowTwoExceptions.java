package Exceptions;

public class ThrowTwoExceptions {
    ThrowTwoExceptions(int number){
        try {
            //1, 2 - ArithmeticException
            //3, 4, 5 - Good
            //6, 7, etc. - ArrayIndexOutOfBoundsException
            System.out.println("randomInt = " + number);
            int[] array = new int[6];
            for (int i = 0; i < number; i++) {
                array[i] = 5 / (1 - number);
                array[i] = 5 / (2 - number);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
        catch (ArithmeticException ex){
            System.out.println("Wystąpił błąd arytmetyczny.");
            ex.printStackTrace();
            System.out.println(ex);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Program wykroczył poza długość szeregu.");
            ex.printStackTrace();
            System.out.println(ex);
        }
        finally{
            System.out.println("Metoda wykonana!");
        }
    }
}
