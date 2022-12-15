package Exceptions;

public class Main {
    public static void main(String[] args){
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
    }

    public static void Zadanie1(){
        try{
            ThrowNullPointer tnp = new ThrowNullPointer();
            System.out.println(tnp.someText);
        }
        catch(Exception ex){
            System.out.println("Wystąpił błąd: Próbowano wywołać niezainicjowany obiekt.");
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
    }

    public static void Zadanie2(){
        for (int i = 0; i < 8; i++){
            ThrowTwoExceptions throwTwoExceptions = new ThrowTwoExceptions(i);
        }
    }

    public static void Zadanie3(){
        Account account1 = new Account("John Doe", 400, 1234);
        Account account2 = new Account("Anna Doe", 570, 4321);
        System.out.println(account1);
        System.out.println(account2);
        account2.transferMoneyTo(account1, 10);
        account1.transferMoneyTo(account2, 1000);
        System.out.println(account1);
        System.out.println(account2);
    }

    public static void Zadanie4(){
        TemperatureChange temperatureChange;
        temperatureChange = new TemperatureChange("blah");
        temperatureChange = new TemperatureChange("-274");
        temperatureChange = new TemperatureChange("1000");
        temperatureChange = new TemperatureChange("30");
        temperatureChange.reportNewTemperature("-10000");
        temperatureChange.reportNewTemperature("10000");
        temperatureChange.reportNewTemperature("10");
        temperatureChange.reportDifference();
    }
}
