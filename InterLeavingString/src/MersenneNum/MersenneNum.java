package MersenneNum;

import java.util.Scanner;
import java.lang.*;

public class MersenneNum {

    public static void main(String[] args) {
      
      double num,Mn;
      
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Mersenne Number Checker");
      System.out.println("Enter a number you would like to check"); 
      num = keyboard.nextInt();
      
      for (int i = 0; i < num; i++)
      {
          
      Mn = Math.pow(2,i) - 1; 
      
      if(Mn == num)
      {
          System.out.println(num + " is a Mersenne number");
      }

 
      }
       System.out.println(num + " is not a Mersenne number");
     
      
    }
    
}
