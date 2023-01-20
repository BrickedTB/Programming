package wordcounter;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input the String");
        String str = keyboard.nextLine();
        
        System.out.println("The number of words in the string are: " + words(str));
        
    }
    
      public static int words(String str)
    {
         int count = 1;
        
        for (int x = 0; x < str.length(); x++)
        {
            if(str.charAt(x) == ' ')
            {
                count++;
            }
            
            
        }
        return count; 
    }
    
}
