package comparestrings;

import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        String s1,s2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the first String"); 
        s1 = keyboard.nextLine();
        
        System.out.println("Enter the second String");
        s2 = keyboard.nextLine();
        
        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller than second");
        else
            System.out.println("Both strings are equal");
        
        
        
    }
    
}
