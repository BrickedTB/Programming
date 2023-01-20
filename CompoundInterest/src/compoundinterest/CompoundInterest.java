package compoundinterest;
import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest {
    
    public static void main(String[] args) {
      double P,R,T,N,A,X,Y;
        
        
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter the Principal invested (P)");
      System.out.println("Enter the rate as a decimal (R)");
      System.out.println("Enter the time of investment (T)");
      System.out.println("Enter how often interest is accrued (quarterly, monthly, etc)(N)");
      
      P = keyboard.nextInt();
      R = keyboard.nextDouble();
      T = keyboard.nextInt();
      N = keyboard.nextInt();
      
      X = (double) (R/N);
      A = (P * Math.pow((1 + X), (R*T)));
      
      System.out.printf("The total plus interest is: %.2f", A);
     
              }
    
}
