package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.PackAnimals;

public class Horse implements PackAnimals{
    public static ArrayList<Horse> listOfHorse = new ArrayList<>(1000);
    public String name;
    public String command;

    public Horse(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataHorse(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Horse animal = new Horse(name, command);
            listOfHorse.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayHorses(){
        System.out.println("\nХомяки:");
        for (int i = 0; i < listOfHorse.size(); i++) {
            if (listOfHorse.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfHorse.get(i).name);
                System.out.println(listOfHorse.get(i).command);
            }
            System.out.println();
        }
    }
}
