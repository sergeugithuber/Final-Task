package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.HomeAnimals;

public class Hamster implements HomeAnimals{
    public static ArrayList<Hamster> listOfHamster = new ArrayList<>(1000);
    public String name;
    public String command;

    public Hamster(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataHamster(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Hamster animal = new Hamster(name, command);
            listOfHamster.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayHamsters(){
        System.out.println("\nХомяки:");
        for (int i = 0; i < listOfHamster.size(); i++) {
            if (listOfHamster.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfHamster.get(i).name);
                System.out.println(listOfHamster.get(i).command);
            }
            System.out.println();
        }
    }
}
