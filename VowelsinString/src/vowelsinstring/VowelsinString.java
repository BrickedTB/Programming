package vowelsinstring;

import java.util.Scanner;

public class VowelsinString {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input the String");
        String str = keyboard.nextLine();
        
        System.out.println("The number of vowels in the string are: " + vowel(str));
        
    }
    public static int vowel(String str)
    {
         int num = 0;
        
        for (int x = 0; x < str.length(); x++)
        {
            if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o'
                    || str.charAt(x) == 'u')
            {
                num++;
            }
            
        }
        return num; 
    }
    
}
