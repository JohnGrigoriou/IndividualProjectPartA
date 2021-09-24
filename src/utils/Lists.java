package utils;

import models.Student;
import models.Course;
import models.Assignment;
import models.Trainer;
import java.util.ArrayList;

public class Lists {

    private static Lists lists;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Trainer> trainers = new ArrayList();
    private ArrayList<Assignment> assignments = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();

    private Lists() {
    }

    public static Lists getInstance() {
        if (lists == null) {
            lists = new Lists();
        }
        return lists;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}
