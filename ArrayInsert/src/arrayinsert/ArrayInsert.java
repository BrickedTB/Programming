package arrayinsert;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {
        int myArray[] = {23,26,27,34,36,38,45,48,51,62};
        
        int position = 2;
        int newValue = 5;
        
        System.out.println("Original Array = " + Arrays.toString(myArray));
        
         for(int i = myArray.length -1; i > position; i--)
    {
        
                myArray[i] = myArray[i-1];
        
    }
         myArray[position] = newValue; 
         System.out.println("New Array = " + Arrays.toString(myArray));
         
    }
    
}
