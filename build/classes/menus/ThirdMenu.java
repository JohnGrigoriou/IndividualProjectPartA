package menus;

import java.util.Scanner;
import utils.Color;
import utils.SortLists;
import utils.View;

public class ThirdMenu {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        SortLists sortls = new SortLists();
        View v = new View();
        sortls.sort();
        Color.print(Color.GREEN,"\n1)  SHOW LIST OF ALL STUDENTS");
        Color.print(Color.GREEN,"2)  SHOW LIST OF ALL TRAINERS");
        Color.print(Color.GREEN,"3)  SHOW LIST OF ALL ASSIGNMENTS");
        Color.print(Color.GREEN,"4)  SHOW LIST OF ALL COURSES");
        Color.print(Color.GREEN,"5)  SHOW LIST OF ALL STUDENTS    PER COURSE");
        Color.print(Color.GREEN,"6)  SHOW LIST OF ALL TRAINERS    PER COURSE");
        Color.print(Color.GREEN,"7)  SHOW LIST OF ALL ASSIGNMENTS PER COURSE");
        Color.print(Color.GREEN,"8)  SHOW LIST OF ALL ASSIGNMENTS PER STUDENT PER COURSE");
        Color.print(Color.GREEN,"9)  SHOW LIST OF ALL STUDENTS THAT BELONG TO MORE THAN ONE COURSE");
        Color.print(Color.GREEN,"10) SHOW LIST OF ALL STUDENTS WHO NEED TO SUBMIT ASSIGNMENTS ON THE");
        Color.print(Color.GREEN,"    SAME CALENDAR WEEK AS THE GIVEN\n");
        Color.print(Color.GREEN,"TO DISPLAY MENU TYPE \"MENU\"");
        Color.print(Color.GREEN,"TO GO TO THE STARTING MENU TYPE \"BACK\"");
        Color.print(Color.RED,"TO LEAVE APP TYPE \"EXIT\"\n\n");        
        while (true) {
            System.out.println("PLEASE TYPE A NUMBER TO CONTINUE...");
            String str = sc.nextLine();
            String choice = str.trim().toUpperCase();
            switch (choice) {
                case "1":
                    v.showStudents();
                    break;
                case "2":
                    v.showTrainers();
                    break;
                case "3":
                    v.showAssignments();
                    break;
                case "4":
                    v.showCourses();
                    break;
                case "5":
                    v.showStudentsPerCourses();
                    break;
                case "6":
                    v.showTrainersPerCourses();
                    break;
                case "7":
                    v.showAssignmentsPerCourses();
                    break;
                case "8":
                    v.showAssignmentsPerStudent();
                    break;
                case "9":
                    v.showStudentsWithMultiples();
                    break;
                case "10":
                    v.showAssignmentsToSubmit();
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
