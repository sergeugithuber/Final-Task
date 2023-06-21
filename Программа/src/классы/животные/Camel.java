package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.PackAnimals;

public class Camel implements PackAnimals {
    public static ArrayList<Camel> listOfCamel = new ArrayList<>(1000);
    public String name;
    public String command;

    public Camel(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataCamel(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Camel animal = new Camel(name, command);
            listOfCamel.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayCamels(){
        System.out.println("\nХомяки:");
        for (int i = 0; i < listOfCamel.size(); i++) {
            if (listOfCamel.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfCamel.get(i).name);
                System.out.println(listOfCamel.get(i).command);
            }
            System.out.println();
        }
    }    
}
