package apothem;

import java.util.Scanner;

public class Apothem {

    public static void main(String[] args) {
      
      double ap, p, A;
      
      System.out.println("Enter the apothem and the perimeter");
        
      Scanner keyboard = new Scanner(System.in);
      ap = keyboard.nextDouble();
      p = keyboard.nextDouble();
      
      A = (0.5 * ap * p);
      
      System.out.println("The area of the pentagon is " + A);
      

    }
    
}
