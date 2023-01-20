package standarddeviationarray;
import java.util.Scanner;
import javax.swing.*;
import java.lang.Math;

public class StandardDeviationArray {

    public static void main(String[] args) { 
        double mean = 0;
        double temp = 0;
        double var = 0;
        double tempvar = 0;
        int size;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter amount of numbers for input");
        size = keyboard.nextInt();
        
        double[] num = new double[size];
        double[] div = new double[size];
        
        System.out.println("Enter in " + size +" numbers");
        
        for (int i = 0; i<size; i++)
        {
            num[i] = keyboard.nextDouble();
            temp += num[i];
            
        }
         mean = temp/size;
         System.out.println("The mean is " + mean);
        
        for (int count = 0; count < size; count++)
        {
           div[count] = Math.pow((num[count] - mean),2.0);
           tempvar += div[count]; 
           System.out.println("(" + num[count] + " - " + mean + ")\u00B2" + " = " +  div[count]);
        }
        var = Math.sqrt((tempvar / size));
        System.out.println("The Variance = " + var); 
                
        
    }
    
}
