package domain;
import java.util.*;
public class HelloWorld {

    public static Integer bonusCalculation(Integer hoursWorked){
        Integer bonus= 0; //initialize to 0
        
        if(hoursWorked < 10){
            bonus = 5;
        } else if(hoursWorked < 30){
            bonus = 10;
        } else{
            bonus = 20;
        }
        
        return bonus;
    }
    
    public static Integer calculateWages(Integer hoursWorked){
        Integer wages = 0;
        Integer hourlyRate = 10;
        System.out.println("Hourly rate = " + hourlyRate);
        
        Integer bonus = bonusCalculation(hoursWorked);
        
        wages = hourlyRate * hoursWorked + bonus;
        
        return wages;
    }
        
    public static void main(String[] args){    
        ArrayList employees = new ArrayList<Integer>();
        employees.add(24);
        employees.add(4);
        employees.add(40);
        
        Integer i = 0;
        for (i=0; i<employees.size(); i++) {
            Integer hoursWorked = (Integer)employees.get(i);
            Integer wages = calculateWages(hoursWorked);
            
            System.out.println("Employee " + (i+1) + " wages for the week are $" + wages);
        }
    }

}
