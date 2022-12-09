package Exceptions;

import Exceptions.ThreeNewExceptions.ValueTooHighException;
import Exceptions.ThreeNewExceptions.ValueTooLowException;

public class TemperatureChange {
    int previousTemperature;
    int currentTemperature;
    final int lowerTemperatureLimit = -100;
    final int higherTemperatureLimit = 100;

    TemperatureChange(String temperature){
        try{
            currentTemperature = Integer.parseInt(temperature);
            if (currentTemperature < lowerTemperatureLimit) throw new ValueTooLowException();
            if (currentTemperature > higherTemperatureLimit) throw new ValueTooHighException();
            previousTemperature = currentTemperature = currentTemperature;
        }
        catch (NumberFormatException | ValueTooLowException | ValueTooHighException ex){
            System.out.println("Invalid input.");
            ex.printStackTrace();
            System.out.println(ex);
            previousTemperature = currentTemperature = 0;
        }
        catch (Exception ex){
            System.out.println("Unknown exception occurred.");
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public void reportNewTemperature(String newTemperature){
        try{
            int newTempAsInt = Integer.parseInt(newTemperature);
            if (newTempAsInt < lowerTemperatureLimit) throw new ValueTooLowException();
            if (newTempAsInt > higherTemperatureLimit) throw new ValueTooHighException();
            previousTemperature = currentTemperature;
            currentTemperature = newTempAsInt;
        }
        catch (NumberFormatException | ValueTooLowException | ValueTooHighException ex) {
            System.out.println("Invalid input.");
            ex.printStackTrace();
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println("Unknown exception occurred.");
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public void reportDifference(){
        System.out.println("Temperature changed by "
                + (currentTemperature - previousTemperature) + " since last two reports.");
    }
}
