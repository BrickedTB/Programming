package bigmacprogram;

import java.util.Scanner; 
public class BigMacProgramWithFries
{
    public static void main(String[] args) 
    {
      double bigMacs = 0;
      double caloriesConsumed = 0;
      double milesToWalk = 0;
      double frenchFries = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many Big Macs did you eat? ");
      bigMacs = keyboard.nextDouble();
      
      Scanner keyboard1 = new Scanner(System.in);
           
      System.out.print("How many French Fries did you eat? ");
      frenchFries = keyboard1.nextDouble();
              
      caloriesConsumed = (bigMacs * 590) + (frenchFries * 384);
      milesToWalk = caloriesConsumed / 93.5;
      
      System.out.println("Wow, you consumed " + caloriesConsumed + " calories");
      System.out.printf("You need to walk %.2f", milesToWalk);
      System.out.print(" miles");
      
    }
   
}
