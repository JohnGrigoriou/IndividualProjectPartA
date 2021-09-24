package data;

import utils.Date;
import utils.Lists;
import models.Student;
import models.Course;
import models.Assignment;
import models.Trainer;
import java.util.Scanner;
import utils.Color;

public class InputData {
    Scanner sc = new Scanner(System.in);
    Lists lists = Lists.getInstance();
    Date date = new Date();
    AddToCourse add = new AddToCourse();

    public void createCourse() {
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag) {
            System.out.println("\nGIVE THE DETAILS OF THE COURSE AS IN THE EXAMPLE BELOW\n");
            System.out.println("NAME STREAM  TYPE  START-DATE  END-DATE");
            System.out.println("CB1  Python  Part  1/1/2021  28/5/2021\n");
            do {
                String input = sc.nextLine();
                String s = input.trim().replaceAll("\\s+"," ");
                String[] element = s.split(" ");
                if (element.length != 5) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[0].matches("[A-Za-z0-9]+"))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[1].matches("[A-Za-z0-9]+"))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[2].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(date.dateString(element[3])) || date.yearNum(element[3]) < 2000) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(date.dateString(element[4])) || date.yearNum(element[4]) < 2000) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (date.localDate(element[3]).isAfter(date.localDate(element[4]))){
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                flag = false;
                Course course = new Course(element[0], element[1], element[2], element[3], element[4]);
                for (Course c : lists.getCourses()){
                    if(course.hashCode()==c.hashCode()){                        
                        flag2 = false;
                    }
                }
                if (flag2 == false){
                    Color.print(Color.RED,"THIS COURSE ALREADY EXISTS!!!\n");                    
                } else {
                    Color.print(Color.GREEN,"COURSE ADDED TO THE LIST");
                    lists.getCourses().add(course);   
                }
                flag1 = false;
            } while (flag1);
        }
    }

    public void createStudent() {
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag) {
            System.out.println("\nGIVE THE DETAILS OF THE STUDENT AS IN THE EXAMPLE BELOW\n");
            System.out.println("NAME SURNAME DATE-OF-BIRTH FEES");
            System.out.println("Jack Alexiou 1/1/2000    1700\n");
            do {
                String input = sc.nextLine();
                String s = input.trim().replaceAll("\\s+"," ");
                String[] element = s.split(" ");
                if (element.length != 4) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[0].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[1].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(date.dateString(element[2])) || date.yearNum(element[2]) < 1920) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[3].chars().allMatch(Character::isDigit))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                flag = false;
                Student student = new Student(element[0], element[1], element[2], Integer.parseInt(element[3]));
                for (Student st : lists.getStudents()){
                    if(student.hashCode()==st.hashCode()){                        
                        flag2 = false;
                    }
                }
                if (flag2 == false){
                    Color.print(Color.RED,"THIS STUDENT ALREADY EXISTS!!!\n");
                } else {
                    Color.print(Color.GREEN,"STUDENT ADDED TO THE LIST");
                    lists.getStudents().add(student);
                    add.addStudents(student);
                }       
                flag1 = false;
            } while (flag1);
        }
    }

    public void createTrainer() {
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag) {
            System.out.println("\nGIVE THE DETAILS OF THE TRAINER AS IN THE EXAMPLE BELOW\n");
            System.out.println("NAME SURNAME SUBJECT");
            System.out.println("John Alexiou Python\n");
            do {
                String input = sc.nextLine();
                String s = input.trim().replaceAll("\\s+"," ");
                String[] element = s.split(" ");
                if (element.length != 3) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[0].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[1].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[2].chars().allMatch(Character::isLetter))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                flag = false;                
                Trainer trainer = new Trainer(element[0], element[1], element[2]);
                for (Trainer t : lists.getTrainers()){
                    if(trainer.hashCode()==t.hashCode()){                        
                        flag2 = false;
                    }
                }
                if (flag2 == false){
                    Color.print(Color.RED,"THIS TRAINER ALREADY EXISTS!!!\n");  
                } else {
                    Color.print(Color.GREEN,"TRAINER ADDED TO THE LIST");
                    lists.getTrainers().add(trainer);
                    add.addTrainers(trainer);
                }
                flag1 = false;
            } while (flag1);
        }
    }

    public void createAssignment() {
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag) {
            System.out.println("\nGIVE THE DETAILS OF THE ASSIGNMENT AS IN THE EXAMPLE BELOW\n");
            System.out.println("TITLE            DESCRIPTION  SUB-DATE-TIME ORAL-MARK TOTAL-MARK");
            System.out.println("JavaAssignment1  TicTacToe    12/12/2020    50        100\n");
            do {
                String input = sc.nextLine();
                String s = input.trim().replaceAll("\\s+"," ");
                String[] element = s.split(" ");
                if (element.length != 5) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[0].matches("[A-Za-z0-9]+"))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[1].matches("[A-Za-z0-9]+"))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(date.dateString(element[2])) || date.yearNum(element[2]) < 2000) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[3].chars().allMatch(Character::isDigit))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (!(element[4].chars().allMatch(Character::isDigit))) {
                    Color.print(Color.RED,"WRONG INPUT!!!\n");
                    break;
                }
                if (Integer.valueOf(element[3]) >= Integer.valueOf(element[4])){
                    Color.print(Color.RED,"WRONG INPUT!!!");
                    Color.print(Color.RED,"TOTAL MARK HAS TO BE GREATER THAN ORAL MARK\n");
                    break;
                }
                flag = false;
                Assignment assignment = new Assignment(element[0], element[1], element[2], Integer.parseInt(element[3]), Integer.parseInt(element[4]));
                for (Assignment a : lists.getAssignments()){
                    if(assignment.hashCode()==a.hashCode()){                        
                        flag2 = false;
                    }
                }
                if (flag2 == false){
                    Color.print(Color.RED,"THIS ASSIGNMENT ALREADY EXISTS!!!\n"); 
                } else {
                    Color.print(Color.GREEN,"ASSIGNMENT ADDED TO THE LIST");
                    lists.getAssignments().add(assignment);
                    add.addAssignments(assignment);
                } 
                flag1 = false;
            } while (flag1);
        }
    }
}
