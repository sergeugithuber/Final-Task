package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.HomeAnimals;

public class Dog implements HomeAnimals{ 
    public static ArrayList<Dog> listOfDog = new ArrayList<>(1000); // так как массив должен иметь фиксированное значение, я установил лимит в 1000 объектов
    public String name;
    public String command;

    public Dog(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataDog(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Dog animal = new Dog(name, command);
            listOfDog.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayDogs(){
        System.out.println("\nСобаки:");
        for (int i = 0; i < listOfDog.size(); i++) {
            if (listOfDog.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfDog.get(i).name);
                System.out.println(listOfDog.get(i).command);
            }
            System.out.println();
        }
    }
}
