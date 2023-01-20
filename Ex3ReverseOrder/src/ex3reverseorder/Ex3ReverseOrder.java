package ex3reverseorder;

import java.util.Arrays;
import java.util.Collections;


public class Ex3ReverseOrder {

    public static void main(String[] args) {

        Integer intArray[] = new Integer[]{
            new Integer(15),
            new Integer(9),
            new Integer(16),
            new Integer(2),
            new Integer(30)
    };
        
      Arrays.sort(intArray, Collections.reverseOrder());
      
      
      System.out.println("Int Array Elements in reverse order:");
      for(int i = 0; i<intArray.length; i++)
          System.out.println(intArray[i]);
      
      String stringArray[] = new String[]{"FF","PP","AA","OO","DD"};
      
      Arrays.sort(stringArray, Collections.reverseOrder());
      
      System.out.println("String Array Elements in reverse order:");
      for(int i = 0; i<intArray.length; i++) 
        System.out.println(stringArray[i]);
          
     
        
        
    }
    
}
