package substringspecified;

import java.util.Scanner; 

public class SubstringSpecified {
    
    public static void main(String[] args) {
        
        String str;
        int pos1,pos2;
        str = "The quick brown fox jumps over the lazy dog.";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(str); 
        
        System.out.println("Enter a specified position");
        pos1 = keyboard.nextInt();
        
        System.out.println("Enter a specified position");
        pos2 = keyboard.nextInt();
        
        System.out.println(str);
        System.out.println("Selected positions: " + str.subSequence(pos1, pos2));
    }
    
}
