package utils;

import java.util.Collections;
import java.util.Comparator;
import models.Assignment;
import models.Course;
import models.Student;
import models.Trainer;

public class SortLists<T extends Comparable<T>> implements Comparator<T> {

    Lists lists = Lists.getInstance();

    @Override
    public int compare(T a, T b) {
        if (a instanceof Student) {
            Student s2 = (Student) a;
            Student s1 = (Student) b;
            return s2.getFirstName().compareTo(s1.getFirstName());
        } else if (a instanceof Trainer) {
            Trainer t2 = (Trainer) a;
            Trainer t1 = (Trainer) b;
            return t2.getFirstName().compareTo(t1.getFirstName());
        } else if (a instanceof Assignment) {
            Assignment as2 = (Assignment) a;
            Assignment as1 = (Assignment) b;
            return as2.getTitle().compareTo(as1.getTitle());
        } else {
            Course c2 = (Course) a;
            Course c1 = (Course) b;
            return c2.getTitle().compareTo(c1.getTitle());
        }
    }

    public void sort() {
        Collections.sort(lists.getStudents(), new SortLists());
        Collections.sort(lists.getTrainers(), new SortLists());
        Collections.sort(lists.getAssignments(), new SortLists());
        Collections.sort(lists.getCourses(), new SortLists());
    }

}
