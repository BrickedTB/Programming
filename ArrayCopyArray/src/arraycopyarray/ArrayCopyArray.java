package arraycopyarray;

import java.util.Arrays;

public class ArrayCopyArray {
    
    public static void main(String[] args) {
        int myArray[] = {4,8,10,12,16,18,20,29,31,37,39};
        int my_array[] = new int[11];

        
        System.out.println("The Array = " + Arrays.toString(myArray));
        
        for(int i = 0; i < myArray.length; i++)
        {
         my_array[i] = myArray[i];
        }
       
        System.out.println("The Copy Array = " + Arrays.toString(my_array));
        
    }
    
}
