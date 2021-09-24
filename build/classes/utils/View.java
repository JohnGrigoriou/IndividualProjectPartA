package utils;

import java.util.ArrayList;
import java.util.Collections;
import models.Assignment;
import models.Course;
import models.Student;
import models.Trainer;

public class View {
    
    Lists lists = Lists.getInstance();

    public void showStudents() {
        if (lists.getStudents().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE STUDENTS AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            Color.print(Color.PURPLE, "   NAME_____________SURNAME________DATE-OF-BIRTH_____FEES");
            int count = 1;
            for (Student s : lists.getStudents()) {
                if (count <= 9) {
                    System.out.println(count + ") " + s);
                } else {
                    System.out.println(count + ")" + s);
                }
                count++;
            }
        }
    }

    public void showTrainers() {
        if (lists.getTrainers().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE TRAINERS AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            Color.print(Color.PURPLE, "  NAME_____________SURNAME____________SUBJECT");
            int count = 1;
            for (Trainer t : lists.getTrainers()) {
                System.out.println(count + ")" + t);
                count++;
            }
        }
    }

    public void showAssignments() {
        if (lists.getAssignments().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE ASSIGNMENTS AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            Color.print(Color.PURPLE, "  TITLE____________DESCRIPTION_________SUB-DATE-TIME______ORAL-MARK______TOTAL-MARK");
            int count = 1;
            for (Assignment ass : lists.getAssignments()) {
                System.out.println(count + ")" + ass);
                count++;
            }
        }
    }

    public void showCourses() {
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            Color.print(Color.PURPLE, "  COURSE___________STREAM_________TYPE______START-DATE_____END-DATE");
            int count = 1;
            for (Course c : lists.getCourses()) {
                System.out.println(count + ")" + c);
                count++;
            }
        }
    }

    public void showStudentsPerCourses() {
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            int count = 0;
            for (Course c : lists.getCourses()) {
                if (!(c.getcStudents().isEmpty())) {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " STUDENTS:");
                    int count1 = 1;
                    for (Student s : c.getcStudents()) {
                        System.out.println(count1 + ")" + s);
                        count1++;
                    }
                    System.out.println("");
                } else {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " HAS NO STUDENTS YET\n");
                    count++;
                }
            }
            if (lists.getCourses().size() == count) {
                System.out.println("THERE ARE NO STUDENTS IN ANY COURSE AT THE MOMENT");
                System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
            }
        }
    }

    public void showTrainersPerCourses() {
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            int count = 0;
            for (Course c : lists.getCourses()) {
                if (!(c.getcTrainers().isEmpty())) {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " TRAINERS:");
                    int count1 = 1;
                    for (Trainer t : c.getcTrainers()) {
                        System.out.println(count1 + ")" + t);
                        count1++;
                    }
                    System.out.println("");
                } else {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " HAS NO TRAINERS YET\n");
                    count++;
                }
            }
            if (lists.getCourses().size() == count) {
                System.out.println("THERE ARE NO TRAINERS IN ANY COURSE AT THE MOMENT");
                System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
            }
        }
    }

    public void showAssignmentsPerCourses() {
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            int count = 0;
            for (Course c : lists.getCourses()) {
                if (!(c.getcAssignments().isEmpty())) {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " ASSIGNMENTS:");
                    int count1 = 1;
                    for (Assignment a : c.getcAssignments()) {
                        System.out.println(count1 + ")" + a);
                        count1++;
                    }
                    System.out.println("");
                } else {
                    Color.print(Color.PURPLE, c.getTitle() + " " + c.getStream() + " " + c.getType() + " HAS NO ASSIGNMENTS YET\n");
                    count++;
                }
            }
            if (lists.getCourses().size() == count) {
                System.out.println("THERE ARE NO ASSIGNMENTS IN ANY COURSE AT THE MOMENT");
                System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
            }
        }
    }

    public void showAssignmentsPerStudent() {
        boolean flag = false;
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            for (Course c : lists.getCourses()) {
                if (!(c.getcStudents().isEmpty())) {
                    if (!(c.getcAssignments().isEmpty())) {
                        Color.print(Color.PURPLE_BACK, "COURSE___________STREAM_________TYPE______START-DATE_____END-DATE");
                        Color.print(Color.PURPLE_BACK, c.toString());
                        flag = true;
                        for (Student s : c.getcStudents()) {
                            Color.print(Color.PURPLE, s.getFirstName() + " " + s.getLastName() + " ASSIGNMENTS:");
                            int count = 1;
                            for (Assignment a : c.getcAssignments()) {
                                System.out.println(count + ")" + a);
                                count++;
                            }
                            System.out.println("");
                        }
                    }
                }
            }
            if (flag == false) {
                System.out.println("THERE ARE NO ASSIGNMENTS PER STUDENT PER COURSE AT THE MOMENT");
                System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
            }
        }
    }

    public void showStudentsWithMultiples() {
        boolean flag1 = false;
        boolean flag2 = false;
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            ArrayList<Student> sMultipleCs = new ArrayList();
            for (Course c : lists.getCourses()) {
                if (!(c.getcStudents().isEmpty())) {
                    for (Student s : c.getcStudents()) {
                        sMultipleCs.add(s);
                    }
                    flag1 = true;
                }
            }
            if (flag1 == true) {
                int count = 1;
                for (Student s : lists.getStudents()) {
                    if (Collections.frequency(sMultipleCs, s) > 1) {
                        System.out.println(count + ")" + s);
                        count++;
                        flag2 = true;
                    }
                }
                if (flag2 == false) {
                    System.out.println("THERE ARE NO STUDENTS THAT BELONG TO MORE THAN ONE COURSES");
                }
            } else {
                System.out.println("THERE ARE NO STUDENTS IN ANY COURSE AT THE MOMENT");
                System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
            }
        }
    }

    public void showAssignmentsToSubmit() {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if (lists.getCourses().isEmpty()) {
            System.out.println("THERE ARE NO AVAILABLE COURSES AT THE MOMENT");
            System.out.println("GO BACK AND ADD SOME IF YOU MAY\n");
        } else {
            Date date = new Date();
            String d = date.validDate();
            for (Course c : lists.getCourses()) {
                if (!(c.getcStudents().isEmpty())) {
                    flag1 = true;
                    if (!(c.getcAssignments().isEmpty())) {
                        flag2 = true;
                        for (Student s : c.getcStudents()) {
                            for (Assignment a : c.getcAssignments()) {
                                if (date.yearNum(d) == date.yearNum(a.getSubDateTime())) {
                                    if (date.weekNum(d) == date.weekNum(a.getSubDateTime())) {
                                        Color.printWord(Color.PURPLE, a.getTitle() + "--->");
                                        System.out.println(s);
                                        flag3 = true;
                                    }
                                }
                            }
                        }
                        System.out.println("");
                    }
                }
            }
        }
        if (flag1 == false) {
            System.out.println("THERE ARE NO STUDENTS IN ANY COURSE AT THE MOMENT");
        } else {
            if (flag2 == false) {
                System.out.println("THERE ARE NO ASSIGNMENTS IN ANY COURSE AT THE MOMENT");
            }
        }
        if (flag2 == true) {
            if (flag3 == false) {
                System.out.println("NO STUDENT HAS TO SUBMIT AN ASSIGNMENT ON THIS CALENDAR WEEK");
            }
        }
    }

}
