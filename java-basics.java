package domain;
import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("WAGES");

        class Employee {
            Integer mHoursWorked;         
            String mName;
            Integer mAge;
            Integer mWages;

            void print() {
                System.out.println( "\nName = " + mName );
                System.out.println( "Age = " + mAge );
                System.out.println( "Hours Worked = " + mHoursWorked );
            }
            
            void calculateWages() {
                Integer hourlyRate = 10;

                print();

                Integer bonusPay = bonusCalculation();
            
                mWages = hourlyRate * mHoursWorked + bonusPay;
                System.out.println( "Wages = " + mWages );

                //return wages;
                // no need to return wages b/c it's a member variable now
            }

            Integer bonusCalculation() {
                Integer bonus = 0;

                if (mHoursWorked < 10)
                    bonus = 5;
            else 
                if (mHoursWorked < 30)
                bonus = 10;
                else
                bonus = 20;

            System.out.println( "Bonus Pay = " + bonus );
            return bonus;
            }
        };


        Employee richard = new Employee();
        richard.mName = "Richard";
        richard.mAge = 35;
        richard.mHoursWorked = 24;

        Employee david = new Employee();
        david.mName = "David";
        david.mAge = 47;
        david.mHoursWorked = 4;

        Employee susan = new Employee();
        susan.mName = "Susan";
        susan.mAge = 22;
        susan.mHoursWorked = 40;

        ArrayList employees = new ArrayList<Employee>();
        employees.add(richard);
        employees.add(david);
        employees.add(susan);
        
        Integer wages;
        
        System.out.println( "Number of employees = " + employees.size() );

        Integer idx;
        for (idx=0; idx<employees.size();idx++) {
            Employee worker = (Employee)employees.get(idx); 

            worker.calculateWages();
            System.out.println( "Your wages are : " + worker.mWages );
        }
    }
}
