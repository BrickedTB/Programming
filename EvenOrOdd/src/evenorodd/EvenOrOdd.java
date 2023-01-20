package evenorodd;
import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
        double num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number.");
        num = keyboard.nextDouble();
        
        if (num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        
    }
    
}
