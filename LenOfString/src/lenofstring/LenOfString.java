package lenofstring;
import java.util.Scanner;
public class LenOfString {

    public static void main(String[] args) {
        String str;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter for string");
        str = keyboard.nextLine();
        
        System.out.println("The length of the String" + " is " + str.length() + " charaters");
        
    }
    
}
