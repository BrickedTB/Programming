package largestnumber;
import java.util.Scanner;
public class LargestNumber {

    public static void main(String[] args) {
        int n1,n2,n3,a;
        int NumOrder[a];
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Enter a number");
        n1 = keyboard.nextInt();
        System.out.println("2. Enter a number");
        n2 = keyboard.nextInt();
        System.out.println("3. Enter a number");
        n3 = keyboard.nextInt();
        
        if (n1 > n2 && n1 > n3)
        {
            first = n1;
        }
        else if (n1 < n2 && n1 < n3)
        {
            NumOrder[1] = n1;
        }
        if (n2 > n1 && n2 > n3)
        {
            NumOrder[2] = n2;
        }
        else if (n2 < n1 && n2 < n3)
            
    }
    
}
