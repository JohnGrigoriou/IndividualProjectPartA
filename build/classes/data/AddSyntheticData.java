package data;

import utils.Lists;
import models.Student;
import models.Course;
import models.Assignment;
import models.Trainer;
import java.util.ArrayList;
import java.util.Arrays;

public class AddSyntheticData {

    public static void addSynthetic() {        
        Lists lists = Lists.getInstance();
        ArrayList<Trainer> trainers = new ArrayList(Arrays.asList(
                new Trainer("George", "Irakleidis", "Java"),
                new Trainer("Spuros", "Mauros", "Java"),
                new Trainer("George", "Pasparakis", "C#"),
                new Trainer("George", "Oikonomou", "C#")));
        lists.getTrainers().addAll(trainers);

        ArrayList<Assignment> assignments = new ArrayList(Arrays.asList(
                new Assignment("Java1", "TicTacToe", "12/12/2020", 20, 100),
                new Assignment("Java2", "PrintTwoWayArrow", "31/12/2020", 20, 100),
                new Assignment("Java3", "MakePrivateSchool", "12/4/2021", 20, 100),
                new Assignment("C#1", "TicTacToe", "12/12/2020", 20, 100),
                new Assignment("C#2", "PrintTwoWayArrow", "31/12/2020", 20, 100),
                new Assignment("C#3", "MakePrivateSchool", "12/4/2021", 20, 100)));
        lists.getAssignments().addAll(assignments);

        ArrayList<Student> students = new ArrayList(Arrays.asList(
                new Student("John", "Grigoriou", "8/5/1995", 2000),
                new Student("John", "Alexiou", "10/5/1994", 2000),
                new Student("Nick", "Alexiou", "10/10/1996", 2000),
                new Student("Alex", "Alexopoulos", "22/7/1990", 2000),
                new Student("Spuros", "Papadopoulos", "8/11/1993", 2000),
                new Student("Georgia", "Vasileiadi", "2/2/1995", 2000),
                new Student("Bill", "Prodromou", "8/5/1989", 2000),
                new Student("George", "Apostolou", "12/4/1991", 2000),
                new Student("George", "Demertzis", "30/5/1997", 2000),
                new Student("Afroditi", "Vlachou", "8/6/1998", 2000),
                new Student("Stella", "Mpranti", "11/6/1999", 2000),
                new Student("Thodoris", "Mouratidis", "9/9/1995", 2000)));
        lists.getStudents().addAll(students);

        ArrayList<Student> studentsJavaCB12 = new ArrayList(Arrays.asList(
                students.get(0), students.get(1), students.get(3)));
        ArrayList<Student> studentsJavaCB13 = new ArrayList(Arrays.asList(
                students.get(4), students.get(5), students.get(6), students.get(7)));
        ArrayList<Student> studentsCsharpCB12 = new ArrayList(Arrays.asList(
                students.get(8), students.get(9), students.get(10), students.get(11)));
        ArrayList<Student> studentsCsharpCB13 = new ArrayList(Arrays.asList(
                students.get(8), students.get(10), students.get(2)));

        ArrayList<Trainer> trainersJavaCB12 = new ArrayList(Arrays.asList(
                trainers.get(0), trainers.get(1)));
        ArrayList<Trainer> trainersJavaCB13 = new ArrayList(Arrays.asList(
                trainers.get(0)));
        ArrayList<Trainer> trainersCsharpCB12 = new ArrayList(Arrays.asList(
                trainers.get(2), trainers.get(3)));
        ArrayList<Trainer> trainersCsharpCB13 = new ArrayList(Arrays.asList(
                trainers.get(3)));

        ArrayList<Assignment> assignmentsJavaCB12 = new ArrayList(Arrays.asList(
                assignments.get(0), assignments.get(1)));
        ArrayList<Assignment> assignmentsJavaCB13 = new ArrayList(Arrays.asList(
                assignments.get(2)));
        ArrayList<Assignment> assignmentsCsharpCB12 = new ArrayList(Arrays.asList(
                assignments.get(3), assignments.get(4)));
        ArrayList<Assignment> assignmentsCsharpCB13 = new ArrayList(Arrays.asList(
                assignments.get(5)));

        ArrayList<Course> courses = new ArrayList(Arrays.asList(
                new Course("CB12", "Java", "Full", "10/10/2020", "10/1/2021", studentsJavaCB12, trainersJavaCB12, assignmentsJavaCB12),
                new Course("CB12", "C#", "Full", "10/10/2020", "10/1/2021", studentsCsharpCB12, trainersCsharpCB12, assignmentsCsharpCB12),
                new Course("CB13", "Java", "Part", "15/2/2021", "15/7/2021", studentsJavaCB13, trainersJavaCB13, assignmentsJavaCB13),
                new Course("CB13", "C#", "Part", "15/2/2021", "15/7/2021", studentsCsharpCB13, trainersCsharpCB13, assignmentsCsharpCB13)));
        lists.getCourses().addAll(courses);

    }
}
