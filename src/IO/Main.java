package IO;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {
    public static void main(String args[]){
        try{
            //Zadanie1();
        }
        catch (Exception ex){ }
        //Zadanie2();
        //Zadanie3();
        Zadanie5();
    }

    public static void Zadanie1() throws IOException {
        FileInputStream fis = null;
        int bit;

        try {
            fis = new FileInputStream("src/IO/textfile.txt");
            do {
                bit = fis.read();
                if (bit != -1) System.out.println((char)bit);
            }
            while (bit != 1);
        }
        catch (FileNotFoundException exception){
            System.out.println("Nie znaleziono pliku.");
        }
        catch (IOException exception){
            System.out.println("Błąd odczytu pliku");
        }
        catch (Exception ex){
            System.out.println("Wystąpił nieznany błąd");
        }
        finally{
            fis.close();
        }
    }

    public static void Zadanie2(){
        int bit;
        try (FileInputStream fis = new FileInputStream("src\\IO\\textfile.txt")){
            do {
                bit = fis.read();
                if (bit != -1) System.out.println((char)bit);
            }
            while (bit != 1);
        }
        catch (FileNotFoundException exception){
            System.out.println("Nie znaleziono pliku.");
        }
        catch (IOException exception){
            System.out.println("Błąd odczytu pliku");
        }
        catch (Exception ex){
            System.out.println("Wystąpił nieznany błąd");
        }
    }

    public static void Zadanie3(){
        int loadedByte;
        FileOutputStream outputStream;

        try (FileInputStream inputStream = new FileInputStream("src\\IO\\space-replacing.txt")){
            outputStream = new FileOutputStream("src\\IO\\space-replacing-result.txt");
            do {
                loadedByte = inputStream.read();
                if (loadedByte == ' ')
                    outputStream.write('-');
                else
                    outputStream.write(loadedByte);
            }
            while (loadedByte != -1);
        }
        catch (FileNotFoundException exception){
            System.out.println("Nie znaleziono pliku.");
            exception.printStackTrace();
        }
        catch (IOException exception){
            System.out.println("Błąd odczytu pliku");
            exception.printStackTrace();
        }
        catch (Exception exception){
            System.out.println("Wystąpił nieznany błąd");
            exception.printStackTrace();
        }
    }

    public static void Zadanie5() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<String> loadedData = new ArrayList<String>();
        int threeFirstDigits = 0;

        try (InputStream inputStream = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt").openStream()){
            StringBuilder loadedFile = new StringBuilder();
            int loadedByte;
            do {
                loadedByte = inputStream.read();
                loadedFile.append((char) loadedByte);
            }
            while (loadedByte != -1);
            String[] tableOfBytes = loadedFile.toString().split("[\r\t\n]");
            for (int i = 0; i < tableOfBytes.length; i++){
                if (tableOfBytes[i] != ""){
                    loadedData.add(tableOfBytes[i].replace(" ", ""));
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Nie znaleziono pliku.");
            exception.printStackTrace();
            return;
        } catch (IOException exception) {
            System.out.println("Błąd przy wczytywaniu pliku.");
            exception.printStackTrace();
            return;
        } catch (Exception exception) {
            System.out.println("Wystąpił nieznany błąd.");
            exception.printStackTrace();
            return;
        }

        boolean correctInput;
        do {
            correctInput = true;
            System.out.print("Podaj trzy pierwsze cyfry jakiegoś konta: ");
            try {
                threeFirstDigits = Integer.parseInt(input.readLine());
            } catch (NumberFormatException exception) {
                System.out.println("Podane dane nie są liczbami.");
                correctInput = false;
            } catch (IOException exception) {
                System.out.println("Wystąpił błąd przy odczytywaniu danych użytkownika.");
                exception.printStackTrace();
                return;
            }
        } while (!correctInput);

        for (int i = 0; i < loadedData.size(); i++) {
            if (loadedData.get(i).contains(Integer.toString(threeFirstDigits)) && loadedData.get(i).length() == 3){
                System.out.println("Znaleziony numer: " + loadedData.get(i));
                System.out.println("Bank: " + loadedData.get(i + 1));
                return;
            }
        }
    }
}
