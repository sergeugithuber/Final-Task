package взаимодействие;

import java.util.Scanner;

public class Menu {
    private static Scanner scan = new Scanner(System.in);

    public static void startProgramm(){
        System.out.println("Start programm");
        boolean status = true; //статус программы true - включена
        while (status != false){
            System.out.println("{1}-добавить животное, {2}-посмотреть список животных, {0}-завершить работу");
            System.out.print(">");
            String com = scan.next(); //com (command) команда, которую вводит пользователь
            
            switch (com) {
                case "1":
                    Commands.AddAnimal(); //добавить животное
                    break;
                
                case "2":
                    Commands.showAnimalList(); //показать список/кол-во определённого животного
                    break;

                case "0":
                    status = false;
                    System.out.println("Turn off programm"); //Выкл
                    break;
                
                default:
                    System.out.println("Uknown command");
                    break;
            }
        }
    }

}
