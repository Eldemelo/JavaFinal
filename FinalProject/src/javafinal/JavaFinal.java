/*
Problem/Question Description:
A small consulting company ECN.INC have decided to hire you. When you go to the office of the human resources to complete new employee’s paperwork,
you are presented with two salary offers and told that, before you start working you must decide which offer you want. The two offers are:

Salary 1: Salary of $117.23 per day for 10 days.
Salary 2: Calculated as follows: first day:  $1.15, second day: $2.30, third day: $4.60, 
and so on, with the amount doubling each day up to the 10th day.
*/

/* Manual/Hands-on Calculations
Salary 1:
117.23 * 10 = 1,172.30
Salary 2:
day1 = 1.15
total = 1.15
day2 = 1.15 * 2 = 2.30
total = 1.15 + 2.30 = 3.45
day3 = 2.30 * 2 = 4.60
total = 3.45 + 4.60 = 8.05
day4 = 4.60 * 2 = 9.20
total = 8.05 + 9.20 = 17.25
day5 = 9.20 * 2 = 18.4
total = 17.25 + 18.40 = 35.65
day6 = 18.4 * 2 = 36.8
total = 35.65 + 36.80 = 72.45
day7 = 36.8 * 2 = 73.6
total = 72.45 + 73.60 = 146.05
day8 = 73.60 * 2 = 147.20
total = 146.05 + 147.20 = 293.25
day9 = 147.20 * 2 = 294.40
total = 293.25 + 294.40 = 587.65
day10 = 294.40 * 2 = 588.80
total = 587.65 + 588.80 = 1,176.45
*/
package javafinal;
import java.util.Scanner;

/**
 *
 * @author blueh
 */
public class JavaFinal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName, lastName;
        double currVal;
        Scanner input = new Scanner(System.in);
        User me = new User();
        System.out.println("Enter the first salary");
        me.salaryOne(input.nextDouble());
        System.out.println("Enter the second salary");
        me.salaryTwo(input.nextDouble());
        me.display();
        
        
    }
    
}
