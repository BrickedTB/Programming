package bubblesort;

import java.util.Arrays;

public class BubbleSortPrac {

    public static void main(String[] args) {
        int[] arr = {2,34,4,56,14,26,95,32};
        int temp = 0;
        int n = arr.length;
        
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {
                if (arr[j-1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
       System.out.println("Sorted Array"); 
          
       for(int i=0; i < arr.length; i++)
       {  
          System.out.print(arr[i] + ",");   
       }
    
}
}
