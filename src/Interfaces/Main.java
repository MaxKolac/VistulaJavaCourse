package Interfaces;

public class Main {
    public static void main(String[] args){
        Zadanie1();
        Zadanie2();
    }

    public static void Zadanie1(){
        Staff staff = new Staff();
        staff.Initialize("John", "Doe", "Long Street", "34 3/4", "ZIP1234", "New York");
        staff.Print();
        staff.Initialize("MTI Senior Developer", "Janitor");
        staff.PrintAll();
        System.out.println("Total salary: " + staff.salaryToPay(48, 25));
    }

    public static void Zadanie2(){
        Animal[] Animals = new Animal[7];
        //Animals[0] = new Animal("Dziki zwierz", 4, 10);
        Animals[1] = new Mammal(true, 4);
        Animals[2] = new Fish("Salt Water", false);
        Animals[3] = new Bird("Red", true);
        Animals[4] = new Dog("Reksio", 5, 8, true, 4, "Small", "German Shepard");
        Animals[5] = new Blowfish("Ms. Puff", 2, 1, "Salt Water", true, false);
        Animals[6] = new Pigeon("Zygmunt", 3, 1, "Dark Blue/White",
                true, 216, 545, 67.33F);

        for (int i = 1; i < Animals.length; i++) {
            Animals[i].eat();
            Animals[i].getVoice();
            AnimalName.name(Animals[i].getName());
            System.out.println(Animals[i].toString());
        }

        AnimalBehavior[] animalbehaviors = new AnimalBehavior[3];
        animalbehaviors[0] = new Dog();
        animalbehaviors[1] = new Blowfish();
        animalbehaviors[2] = new Pigeon();

        for (AnimalBehavior animal: animalbehaviors) {
            animal.sleep();
        }
    }
}
