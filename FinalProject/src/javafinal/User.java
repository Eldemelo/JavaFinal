/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafinal;
import java.util.Scanner;

/**
 *
 * @author blueh
 */
public class User {
    private String firstName, lastName, fullName;
    public User(){
        firstName = "null";
        lastName = "null";
        fullName = "null";
    }
    double startingSalary1, startingSalary2, currVal;
    double salaryOne, salaryTwo, bestSalary, dailySalary;

    public void salaryOne(double value){
        startingSalary1 = value;
    }
    
    public void salaryTwo(double value){
        startingSalary2 = value;
    }
    
    public double salaryOneOutput(){
        return startingSalary1;
    }
    
    public double salaryTwoOutput(){
        return startingSalary2;
    }

    // Method to calculate the firest salary
    public double calcSalaryOne(){
        salaryOne = salaryOneOutput() * 10;
        return salaryOne;
        
    }// Method to calculate the second salary
    public double calcSalaryTwo(){
        salaryTwo = salaryTwoOutput();
        dailySalary = salaryTwo;
        int i;
        for(i = 1; i < 10; i++){
            dailySalary *= 2;
            salaryTwo += dailySalary;
        }
        return salaryTwo;
    }

    // Method to compare the two salaries
    public double comparison(){
        salaryOne = calcSalaryOne();
        salaryTwo = calcSalaryTwo();
        if (salaryOne > salaryTwo){
            bestSalary = salaryOne;
        }
        else{
            bestSalary = salaryTwo;
        }
        return bestSalary;
    }
    
    // Method to hold the full name
    public String names(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName = input.next();
        System.out.println("Enter last name:");
        lastName = input.next();
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    // Method to print the best salary result
    public void display(){
        System.out.print(names() + " hiring salary is $");
        System.out.printf("%.2f", comparison());
        System.out.println();
    }
    
}