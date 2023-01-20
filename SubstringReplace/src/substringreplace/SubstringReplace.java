package substringreplace;

import java.util.Scanner;

public class SubstringReplace {

    public static void main(String[] args) {
        String str,str1,str2;
        str = "The quick brown fox jumps over the lazy dog.";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the word you want to replace");
        str1 = keyboard.nextLine();
        
        System.out.println("Enter a word you want it with replace");
        str2 = keyboard.nextLine();
        
        System.out.println(str);
        System.out.println("The new phrase is: " + str.replace(str1, str2));
        
        
    }
    
}
