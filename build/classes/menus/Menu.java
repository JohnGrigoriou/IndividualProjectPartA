package menus;

import data.AddSyntheticData;
import java.util.Scanner;
import utils.Color;

public class Menu {
    
    static int i = 0;
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        
        Color.print(Color.GREEN,"\n1) ADD SYNTHETIC DATA");
        Color.print(Color.GREEN,"2) ADD YOUR OWN DATA");
        Color.print(Color.GREEN,"3) SHOW DATA\n");
        Color.print(Color.RED,"TO LEAVE APP TYPE \"EXIT\"\n\n");        
        while (true) {
            System.out.println("PLEASE TYPE A NUMBER TO CONTINUE...");
            String str = sc.nextLine();
            String choice = str.trim().toUpperCase();
            switch (choice) {
                case "1":
                    if (i == 0) {
                        AddSyntheticData.addSynthetic();
                        Color.print(Color.GREEN,"SYNTHETIC DATA ADDED SUCCESSFULLY!!!\n");
                        i++;
                    } else {
                        Color.print(Color.RED,"SYNTHETIC DATA HAVE ALREADY BEEN ADDED!!!\n");
                    }
                    break;
                case "2":
                    SecondMenu.menu();
                case "3":
                    ThirdMenu.menu();
                case "EXIT":
                    Color.print(Color.YELLOW,"\n\n\n_______________THANK YOU FOR USING OUR PRIVATE SCHOOLS APP_______________");
                    System.exit(0);
                default:
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
            }
        }
    }
}
