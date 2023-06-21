package взаимодействие;

import java.util.Scanner;

import классы.животные.*;

public class Commands {
    private static Scanner scan = new Scanner(System.in);
    
    public static void AddAnimal(){
        System.out.println("{1}-собака {2}-кошка {3}-хомяк {4}-лошадь {5}-верблюд {6}-осёл {0}-отмена");
        String com = scan.next();
        switch (com) {
            case "1":
                Dog.GetDataDog(scan);
                break;
            case "2":
                Cat.GetDataCat(scan);
                break;
            case "3":
                Hamster.GetDataHamster(scan);
                break;
            case"4":
                Horse.GetDataHorse(scan);
                break;
            case"5":
                Camel.GetDataCamel(scan);
                break;
            case"6":
                Donkey.GetDataDonkey(scan);
                break;
            case "0":
                System.out.println("Отмена");
                break;
            default:
                System.out.println("uknow command");
                break;
        }
        
    }

    public static void showAnimalList(){
        System.out.println("{1}-собаки {2}-кошки {3}-хомяки {4}-лошади {5}-верблюды {6}-ослы {0}-отмена");
        String com = scan.next();
        switch (com) {
            case "1":
                Dog.showArrayDogs();
                break;
            case "2":
                Cat.showArrayCats();
                break;
            case "3":
                Hamster.showArrayHamsters();
                break;
            case "4":
                Horse.showArrayHorses();
                break;
            case "5":
                Camel.showArrayCamels();
                break;
            case "6":
                Donkey.showArrayDonkeys();
                break;
            case "0":
                System.out.println("Отмена");
                break;
            default:
                break;
        }
    }

    

}
