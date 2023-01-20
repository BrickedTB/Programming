package arrayminmax;

import java.util.Arrays;

public class ArrayMinMax {
    
    public static void main(String[] args) {
        
        int myArray[] = {3,23,57,24,68,25,79,29,34,56,78};
        int min,max;
        
            min = myArray[0]; 
            max = myArray[0];
        
        for (int i = 1; i < myArray.length; i++)
        {
            
            if (myArray[i] > max)
            {
                max = myArray[i];
            }
            
            if (myArray[i] < min)
            {
                min = myArray[i];
            }
        }
        
        System.out.println("The Maximum number in the array is: " + max);
        System.out.println("The Minimum number in the array is: " + min);
    }
    
}
