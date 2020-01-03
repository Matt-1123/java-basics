package domain;
import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("WAGES");

        class Employee {
            Integer hoursWorked;         
            String name;
            Integer age;


            void print() {
                System.out.println( "\nName = " + name );
                System.out.println( "Age = " + age );
                System.out.println( "Hours Worked = " + hoursWorked );
            }
            
            Integer calculateWages(Integer hoursWorked) {
                Integer wages = 0;

                Integer hourlyRate = 10;

                print();

                Integer bonusPay = bonusCalculation(hoursWorked);
            
                wages = hourlyRate * hoursWorked + bonusPay;
                    System.out.println( "Wages = " + wages );

                return wages;
            }

            Integer bonusCalculation(Integer hoursWorked) {
                Integer bonus = 0;

                if (hoursWorked < 10)
                    bonus = 5;
            else 
                if (hoursWorked < 30)
                bonus = 10;
                else
                bonus = 20;

            System.out.println( "Bonus Pay = " + bonus );
            return bonus;
            }
        };


        Employee richard = new Employee();
        richard.name = "Richard";
        richard.age = 35;
        richard.hoursWorked = 24;

        Employee david = new Employee();
        david.name = "David";
        david.age = 47;
        david.hoursWorked = 4;

        Employee susan = new Employee();
        susan.name = "Susan";
        susan.age = 22;
        susan.hoursWorked = 40;

        ArrayList employees = new ArrayList<Employee>();
        employees.add(richard);
        employees.add(david);
        employees.add(susan);
        
        Integer wages;
        
        System.out.println( "Number of employees = " + employees.size() );

        Integer idx;
        for (idx=0; idx<employees.size();idx++) {
            Employee worker = (Employee)employees.get(idx); 

            wages = worker.calculateWages(worker.hoursWorked);
        }
    }
}
