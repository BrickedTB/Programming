package middlecharofstring;

import java.util.Scanner;

public class MiddleCharOfString {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input the String");
        String str = keyboard.nextLine();
        
        System.out.println("The middle chars of the String are: " + middle(str));
        
    }
    public static String middle(String str)
    {
        int pos,len;
        
        if (str.length() % 2 == 0)
        {
            pos = str.length()/2 - 1;
            len = 2;
        }
        else
        { 
            pos = str.length()/2;
            len = 1;
        }
        return str.substring(pos, pos + len);            
            
    }
}
