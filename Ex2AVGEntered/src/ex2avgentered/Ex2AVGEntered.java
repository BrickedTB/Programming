package ex2avgentered;

import java.util.Scanner;

public class Ex2AVGEntered {

    public static void main(String[] args) {
        System.out.println("how mant numbers do you want to enter");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        double arr[] = new double[n];
        double total = 0;
        
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print("Enter Element No." + (i+1) + ":");
            arr[i] = scanner.nextDouble();
        }
        
        scanner.close();
        for (int i = 0; i<arr.length; i++)
        {
            total = total + arr[i];
        }
        
        double average = total / arr.length;
        
        System.out.format("The average is: %.3f",average);
    }
    
}
