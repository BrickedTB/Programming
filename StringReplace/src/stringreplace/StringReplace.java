package stringreplace;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {
        String str;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Replaces 'd' with 'f' characters");
        System.out.println("Enter a String");
        str = keyboard.nextLine();
        
        System.out.println("The new string is: " + str.replace('d', 'f')); 
        
    }
    
}
