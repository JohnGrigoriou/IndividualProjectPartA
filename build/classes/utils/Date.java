package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Date {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

    public boolean dateString(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, formatter);
            if(!(formatter.format(localDate).equals(date))){
                return false;
            }
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public String validDate() {        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("GIVE A VALID DATE AS IN THE EXAMPLE BELOW");
            System.out.println("1/1/2022");
            String date = sc.nextLine().trim();
            LocalDate localDate = LocalDate.parse(date, formatter);
            if(!(formatter.format(localDate).equals(date))){
                Color.print(Color.RED, "WRONG INPUT!!!");
                return validDate();
            }    
            return formatter.format(localDate);
        } catch (DateTimeParseException e) {
            Color.print(Color.RED, "WRONG INPUT!!!");
            return validDate();
        }        
    }

    public LocalDate localDate(String date) {
        return LocalDate.parse(date, formatter);
    }

    public int weekNum(String date) {
        return localDate(date).get(WeekFields.ISO.weekOfYear());
    }

    public int yearNum(String date) {
        String[] s = date.split("/");
        return Integer.parseInt(s[2]);
    }
    
}
