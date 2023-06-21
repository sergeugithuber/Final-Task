package классы.животные;

import java.util.ArrayList;
import java.util.Scanner;

import классы.HomeAnimals;

public class Cat implements HomeAnimals{ 
    public static ArrayList<Cat> listOfCat = new ArrayList<>(1000); // так как массив должен иметь фиксированное значение, я установил лимит в 1000 объектов
    public String name;
    public String command;

    public Cat(String name, String command){
        this.name = name;
        this.command = command;
    }

    public static void GetDataCat(Scanner scanner){
        boolean tly = false;
        while(tly != true){
            try  {
            System.out.print("имя животного: ");
            String name = scanner.next();
            System.out.print("команда(ы) животного: ");
            String command = scanner.next();
            Cat animal = new Cat(name, command);
            listOfCat.add(animal);
            tly = true;

            } catch (Exception e) {
                System.out.println("неверный тип данных");
            }
        }
    }

    public static void showArrayCats(){
        System.out.println("\nКошки:");
        for (int i = 0; i < listOfCat.size(); i++) {
            if (listOfCat.get(i) == null){
                break;
            } else {
                System.out.printf("#%d", i + 1);
                System.out.println();
                System.out.println(listOfCat.get(i).name);
                System.out.println(listOfCat.get(i).command);
            }
            System.out.println();
        }
    }
}
