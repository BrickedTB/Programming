package checkstring;

import java.util.Scanner;

public class CheckString {

    public static void main(String[] args) {
        
        String str,str1;
        str = "The quick brown fox jumps over the lazy dog.";
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println(str);
        System.out.println("Enter a word you want to check");
        str1 = keyboard.nextLine();
        
        if(str.contains(str1))
        {
            System.out.println(str + " contains " + str1);
        }
        else {
            System.out.println(str + " does not contain " + str1);
        }

              
                
              
                    
    }        
}
