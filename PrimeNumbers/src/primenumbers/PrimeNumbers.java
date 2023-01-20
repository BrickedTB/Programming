package primenumbers;

import java.util.Scanner;
import java.lang.Math;

public class PrimeNumbers 
{

    public static void main(String[] args)
    {
        int status = 1, num = 3; 
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers that you want");
        int n = keyboard.nextInt();
        
        if (n>1)
        {
           System.out.println("First " + n + " prime numbers");
           System.out.println(2); 
        }
        for (int count = 2; count <= n; count++)
        {
            for (int j = 2; j <= Math.sqrt(num); j++)
            {
                if (num%j == 0)
                {
                    status = 0;
                    break;
                    
                }
                
            }
            if (status != 0)
            {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }

    }
    
}
