package models;

import java.util.ArrayList;
import java.util.Objects;

public class Course implements Comparable{

    private String title;
    private String stream;
    private String type;
    private String startDate;
    private String endDate;
    private ArrayList<Student> cStudents = new ArrayList<>();
    private ArrayList<Trainer> cTrainers = new ArrayList<>();
    private ArrayList<Assignment> cAssignments = new ArrayList<>();       

    public Course(String title, String stream, String type, String startDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(String title, String stream, String type, String startDate, String endDate, ArrayList<Student> students, ArrayList<Trainer> trainers, ArrayList<Assignment> assignments) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cStudents = students;
        this.cTrainers = trainers;
        this.cAssignments = assignments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getcStudents() {
        return cStudents;
    }

    public void setcStudents(ArrayList<Student> cStudents) {
        this.cStudents = cStudents;
    }

    public ArrayList<Trainer> getcTrainers() {
        return cTrainers;
    }

    public void setcTrainers(ArrayList<Trainer> cTrainers) {
        this.cTrainers = cTrainers;
    }

    public ArrayList<Assignment> getcAssignments() {
        return cAssignments;
    }

    public void setcAssignments(ArrayList<Assignment> cAssignments) {
        this.cAssignments = cAssignments;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, stream, type);
    }
    
    @Override
    public String toString() {
        return String.format("%1$-17s%2$-15s%3$-10s%4$-15s%5$-10s", title, stream, type, startDate, endDate);
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
