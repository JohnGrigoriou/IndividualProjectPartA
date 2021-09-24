package data;

import utils.Date;
import utils.Lists;
import models.Student;
import models.Course;
import models.Assignment;
import models.Trainer;
import java.util.ArrayList;
import java.util.Scanner;
import utils.Color;

public class AddToCourse {

    Scanner sc = new Scanner(System.in);
    Lists lists = Lists.getInstance();
    Date date = new Date();

    public void addStudents(Student student) {
        System.out.println("DO YOU WANT TO ADD THE STUDENT TO A COURSE?");
        System.out.println("TYPE \"YES\" OR \"NO\"");
        String str = sc.nextLine().trim().toLowerCase();
        if (str.equals("yes")) {
            if (!(lists.getCourses().isEmpty())) {
                int i = 1;
                System.out.println("THE AVAILABLE COURSES ARE");
                for (Course c : lists.getCourses()) {
                    System.out.println(i + " - " + c);
                    i++;
                }
                int j = 1;
                for (Course c : lists.getCourses()) {
                    System.out.println("IF YOU WANNA ADD THE STUDENT TO COURSE " + j + " TYPE \"YES\", ELSE TYPE ANYTHING");
                    if (sc.nextLine().trim().toLowerCase().equals("yes")) {
                        lists.getCourses().get(j - 1).getcStudents().add(student);
                        Color.print(Color.GREEN,student + " ADDED TO COURSE " + j);
                    }
                    j++;
                }
            } else {
                System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            }
        } else if (str.equals("no")) {
            System.out.println("STUDENT NOT ADDED");
        } else {
            Color.print(Color.RED,"WRONG INPUT!!!");
            addStudents(student);
        }
    }

    public void addTrainers(Trainer trainer) {
        System.out.println("DO YOU WANT TO ADD THE TRAINER TO A COURSE?");
        System.out.println("TYPE \"YES\" OR \"NO\"");
        String str = sc.nextLine().trim().toLowerCase();
        if (str.equals("yes")) {
            if (!(lists.getCourses().isEmpty())) {
                int i = 1;
                System.out.println("THE AVAILABLE COURSES ARE");
                for (Course c : lists.getCourses()) {
                    System.out.println(i + " - " + c);
                    i++;
                }
                int j = 1;
                for (Course c : lists.getCourses()) {
                    System.out.println("IF YOU WANNA ADD THE TRAINER TO COURSE " + j + " TYPE \"YES\", ELSE TYPE ANYTHING");
                    if (sc.nextLine().trim().toLowerCase().equals("yes")) {
                        lists.getCourses().get(j - 1).getcTrainers().add(trainer);
                        Color.print(Color.GREEN,trainer + " ADDED TO COURSE " + j);
                    }
                    j++;
                }
            } else {
                System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            }
        } else if (str.equals("no")) {
            System.out.println("TRAINER NOT ADDED");
        } else {
            Color.print(Color.RED,"WRONG INPUT!!!");
            addTrainers(trainer);
        }
    }

    public void addAssignments(Assignment assignment) {
        System.out.println("DO YOU WANT TO ADD THE ASSIGNMENT TO A COURSE?");
        Color.print(Color.RED,"BE CAREFUL! THE ASSIGNMENTS SUB-DATE MUST BE BETWEEN START AND END DATE OF THE COURSE");
        System.out.println("TYPE \"YES\" OR \"NO\"");
        String str = sc.nextLine().trim().toLowerCase();
        if (str.equals("yes")) {
            if (!(lists.getCourses().isEmpty())) {
                int i = 1;
                System.out.println("CHECKING FOR AVAILABLE COURSES...");
                ArrayList<Course> availableC = new ArrayList<>();
                for (Course c : lists.getCourses()) {
                    if (date.localDate(assignment.getSubDateTime()).isAfter(date.localDate(c.getStartDate()))) {
                        if (date.localDate(assignment.getSubDateTime()).isBefore(date.localDate(c.getEndDate()))) {
                            availableC.add(c);
                            System.out.println(i + " - " + c);
                            i++;
                        }
                    }
                }
                if (availableC.isEmpty()){
                    Color.print(Color.RED,"NO AVAILABLE COURSES FOUND");
                }
                int j = 1;
                for (Course c : availableC) {
                    System.out.println("IF YOU WANNA ADD THE ASSIGNMENT TO COURSE " + j + " TYPE \"YES\", ELSE TYPE ANYTHING");
                    if (sc.nextLine().trim().toLowerCase().equals("yes")) {
                        availableC.get(j - 1).getcAssignments().add(assignment);
                        Color.print(Color.GREEN,assignment + " ADDED TO COURSE " + j);
                    }
                    j++;
                }
            } else {
                System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            }
        } else if (str.equals("no")) {
            System.out.println("ASSIGNMENT NOT ADDED");
        } else {
            Color.print(Color.RED,"WRONG INPUT!!!");
            addAssignments(assignment);
        }
    }
}
