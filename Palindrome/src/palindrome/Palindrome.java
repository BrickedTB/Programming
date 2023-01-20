package palindrome;
import java.util.Arrays;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        String word,pal = "";
        int len;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a word");
        word = keyboard.nextLine();
        
        len = word.length();
        
      for(int i = len - 1; i >= 0 ; i--)
        {
         pal = pal + word.charAt(i); 
        }
   
          System.out.println("The Palindrome is = " + pal);
    
    }
    
}
