package regionstring;

import java.util.Scanner;

public class RegionString {

    public static void main(String[] args) {
        
        String str1,str2;
        str1 = "Patrick";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a region of String");
        str2 = keyboard.nextLine();
        
        if (str1.contains(str2))
        {
        System.out.println("The string " + str1 + " contains " + str2);
        }
        else
        {
        System.out.println("The string " + str1 + " does not contain " + str2);
        }
    }
    
}
