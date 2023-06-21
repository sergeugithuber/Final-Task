package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.PackAnimals;

public class Donkey implements PackAnimals{
    public static ArrayList<Donkey> listOfDonkey = new ArrayList<>(1000);
    public String name;
    public String command;

    public Donkey(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataDonkey(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Donkey animal = new Donkey(name, command);
            listOfDonkey.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayDonkeys(){
        System.out.println("\nСобаки:");
        for (int i = 0; i < listOfDonkey.size(); i++) {
            if (listOfDonkey.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfDonkey.get(i).name);
                System.out.println(listOfDonkey.get(i).command);
            }
            System.out.println();
        }
    }
}