package domain;
import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("WAGES");
        
        Integer wages;
        Integer hourlyRate;
        hourlyRate = 10;
        
        ArrayList employees = new ArrayList<Integer>();
        employees.add(24);
        employees.add(4);
        employees.add(40);
        
        Integer i = 0;
        for (i=0; i<employees.size(); i++) {
            Integer hoursWorked = (Integer)employees.get(i);
            wages = hourlyRate * hoursWorked;
            System.out.println("Employee " + (i+1) + " wages for the week are $" + wages);
        }
    }

}