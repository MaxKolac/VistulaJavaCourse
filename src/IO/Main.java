package IO;

import java.io.*;

public class Main {
    public static void main(String args[]){
        try{
            //Zadanie1();
        }
        catch (Exception ex){ }
        //Zadanie2();
        Zadanie3();
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
        int threeFirstDigits;
        String database = "";

        try (FileInputStream inputStream = new FileInputStream("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt")) {
            int loadedByte;
            do {
                loadedByte = inputStream.read();
                database += (char)loadedByte;
            }
            while (loadedByte != -1);
        } catch (FileNotFoundException exception) {
            System.out.println("Nie znaleziono pliku.");
            System.out.println(exception);
            exception.printStackTrace();
            return;
        } catch (IOException exception) {
            System.out.println("Błąd przy wczytywaniu pliku.");
            System.out.println(exception);
            exception.printStackTrace();
            return;
        } catch (Exception exception) {
            System.out.println("Wystąpił nieznany błąd.");
            System.out.println(exception);
            exception.printStackTrace();
            return;
        }

        boolean correctInput;
        do {
            correctInput = true;
            System.out.print("Podaj trzy pierwsze cyfry jakiegoś konta: ");
            try {
                threeFirstDigits = Integer.parseInt(input.readLine());
            } catch (IOException exception) {
                System.out.println("Wystąpił błąd przy odczytywaniu danych użytkownika.");
                correctInput = false;
            } catch (NumberFormatException exception) {
                System.out.println("Podana dana nie jest liczbą.");
                correctInput = false;
            }
        } while (!correctInput);


    }
}
