package heronsmethod;

import java.util.Scanner;

public class HeronsMethod {

    public static void main(String[] args) {
      double s1, s2, s3;
      double A, TempA;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the three sides of the Triangle");
      s1 = keyboard.nextDouble(); 
      s2 = keyboard.nextDouble(); 
      s3 = keyboard.nextDouble();
      
      if (s1 + s2 > s3)
      {
          if (s2 + s3 > s1)
          {
              if (s1 + s3 > s2)
              {
               A = (s1+s2+s3)/2.0d;
               TempA = Math.sqrt(A* (A - s1) * (A - s2) * (A - s3));
               System.out.println("Area of Triangle = " + TempA);
              }
               else {
               System.out.println("Not a triangle");
              }
          }
           else {
                System.out.println("Not a triangle");
                }

        }
   }
    
}