package factorialofnumber;
import java.util.Scanner; 
public class FactorialofNumber {

    public static void main(String[] args) {
        int i, n, fact = 1;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number to find its factorial");
        
        n = keyboard.nextInt();
        if (n<=0){
            System.out.println("Cannot enter a number 0 or lower");
        }
            else
            {
                for (i = 1; i<=n; i++)
                {
                    fact = fact * i;
                    
            
                }
                System.out.println("The Factorial of " + n + " is = " + fact);
            }
    
        }
}
