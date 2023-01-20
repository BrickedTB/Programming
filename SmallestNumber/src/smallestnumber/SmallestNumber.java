package smallestnumber;
import java.util.Scanner;
public class SmallestNumber {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input the first number");
        double a = keyboard.nextDouble();
        System.out.println("Input the second number");
        double b = keyboard.nextDouble();
        System.out.println("Input the third number");
        double c = keyboard.nextDouble();
        
        System.out.println("The smallest number is " + Small(a,b,c));
        
    }
    
    public static double Small(double a, double b, double c)
    {
        return Math.min(Math.min(a,b), c);
    }
    
}
