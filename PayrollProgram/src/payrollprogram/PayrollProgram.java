package payrollprogram;

import java.util.Scanner; 

public class PayrollProgram {
    
    public static void main(String[] args) {
        
    double hoursWorked;
    double hourlyPayRate;
    double grossPay;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("How many hours did you work? ");
    hoursWorked = keyboard.nextDouble();
    System.out.print("How much do you get paid per hour? ");
    hourlyPayRate = keyboard.nextDouble();
    
    if(hoursWorked <= 40)
    {
        grossPay = hoursWorked * hourlyPayRate;
    }
    else 
    {
        grossPay = (hoursWorked) * (1.5 * hourlyPayRate);
    }
    
    System.out.println("Your Gross pay is $" + grossPay);
    System.out.println("Your Net pay is $" + (grossPay * 0.33));
     
    }
    
}
