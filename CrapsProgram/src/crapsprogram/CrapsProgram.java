package crapsprogram;
import java.util.Scanner;
import java.util.Random;
public class CrapsProgram {

    public static void main(String[] args) {
   
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int target;
        int roll;
           
        System.out.println("Enter 1 to start game");
        int start = keyboard.nextInt();
        
        if (start == 1)
        {
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        roll = roll1 + roll2;
        System.out.println("Dice 1 = " + roll1 + " Dice 2 = " + roll2);
        
        if (roll == 7 || roll == 11)
        {
            System.out.println(roll1 + " + " + roll2 + " = " + roll +" Player wins.");
            
        }
        
        if (roll == 2 || roll == 3 || roll == 12)
        {
            System.out.println(roll1 + " + " + roll2 + " = " + roll + " Player loses.");
        }
        
        if (roll > 4 && roll < 10)
                {
                    target = roll1 + roll2;
                    
                }
                
        while (roll != (target = roll1 + roll2))
        {
            
         if (roll == 7)
         {
             System.out.println("Player loses.");
         }
         roll1 = rand.nextInt(6) + 1;
         roll2 = rand.nextInt(6) + 1;
         roll = roll1 + roll2;
         System.out.println(roll1 + " + " + roll2 + " = " + roll);
        }
        
        }
}
    
}
