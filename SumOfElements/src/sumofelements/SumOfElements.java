package sumofelements;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {
        
        int c,d,s,n1,n2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a specified number");
        s = keyboard.nextInt();
        
        int first[][] = new int[2][2];
        int second[][] = new int[2][2];
        int sum[][] = new int[2][2];
        
        
        System.out.println("Enter the elements of first matrix");
        
        for (c = 0; c < 2; c++)
            for(d = 0; d < 2; d++)
                first[c][d] = keyboard.nextInt();
        
        System.out.println("Enter the elements second matrix");
        
      for (c = 0; c < 2; c++)
            for(d = 0; d < 2; d++)
                second[c][d] = keyboard.nextInt();
      
         for (c = 0; c < 2; c++)
            for(d = 0; d < 2; d++)
                sum[c][d] = first[c][d] + second[c][d];
         
        System.out.println("Sum of entered matricies = "); 
        
        for (c = 0; c < 2; c++)
        {
            for(d = 0; d < 2; d++)
            {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println("\n");
        }
        
        for(c = 0; c < 2; c++)
        {
            for(d = 0; d < 2; d++)
            {
                if (sum[c][d] == s)
                {
                    System.out.println(first[c][d] + " + " + second[c][d] + " = " + s); 
                }
            }
        }
    }
}


    
