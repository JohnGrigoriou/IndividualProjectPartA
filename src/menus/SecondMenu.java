package menus;

import data.InputData;
import java.util.Scanner;
import utils.Color;

public class SecondMenu {

    public static void menu() {
        InputData input = new InputData();
        Scanner sc = new Scanner(System.in);
        Color.print(Color.GREEN,"\n1) CREATE A  COURSE");
        Color.print(Color.GREEN,"2) CREATE A  STUDENT");
        Color.print(Color.GREEN,"3) CREATE A  TRAINER");
        Color.print(Color.GREEN,"4) CREATE AN ASSIGNMENT\n");
        Color.print(Color.GREEN,"TO DISPLAY MENU TYPE \"MENU\"");
        Color.print(Color.GREEN,"TO GO TO THE STARTING MENU TYPE \"BACK\"");
        Color.print(Color.RED,"TO LEAVE APP TYPE \"EXIT\"\n\n");        
        while (true) {
            System.out.println("PLEASE TYPE A NUMBER TO CONTINUE...");
            String str = sc.nextLine();
            String choice = str.trim().toUpperCase();
            switch (choice) {
                case "1":
                    input.createCourse();
                    break;
                case "2":
                    input.createStudent();
                    break;
                case "3":
                    input.createTrainer();
                    break;
                case "4":
                    input.createAssignment();
                    break;
                case "MENU":
                    menu(); 
                case "BACK":
                    Menu.menu();
                case "EXIT":
                    Color.print(Color.YELLOW,"_______________THANK YOU FOR USING OUR PRIVATE SCHOOLS APP_______________");
                    System.exit(0);
                default:
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
            }
        }
    }
}
