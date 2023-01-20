package averageofthree;

import java.util.Scanner;
import java.lang.Math;

public class AverageofThree {

    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input the first number");
        double a = keyboard.nextDouble();
        System.out.println("Input the second number");
        double b = keyboard.nextDouble();
        System.out.println("Input the third number");
        double c = keyboard.nextDouble();
        
        System.out.println("The average number is " + avg(a,b,c));
        
    }
    
   public static double avg(double a, double b, double c)
    {
        return ((a + b + c)/3);
    }
    
}
