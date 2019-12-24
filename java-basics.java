import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("WAGES");
        
        Integer hourlyRate;
        Integer hoursWorked;
        hourlyRate = 10;
        hoursWorked = 40;
        
        ArrayList employees = new ArrayList<Integer>();
        employees.add(24);
        employees.add(4);
        employees.add(40);
        System.out.println(employees);
        
        Integer wages = hourlyRate * (Integer)employees.get(0);
        System.out.println("You've worked " + hoursWorked + " hours and made $" + (Integer)employees.get(0) + " this week.");
        System.out.println("You've worked " + hoursWorked + " hours and made $" + (Integer)employees.get(1) + " this week.");
        System.out.println("You've worked " + hoursWorked + " hours and made $" + (Integer)employees.get(2) + " this week.");

    }

}
