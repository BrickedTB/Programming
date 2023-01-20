package sumofdigits;

import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input an Integer");
        int num = keyboard.nextInt();
        
        System.out.println("The sum of digits in the integer are: " + sum(num));
        
    }
    
       public static int sum(int num)
    {
        int temp = 0;
        
        if (num > 9)
        {
           temp += num % 10;
           num = (num - temp) / 10;
           num += temp; 
           
           return num;
        }
        else
        {
            return num;
        }

    
    }
}
