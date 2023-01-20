package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = {2,34,4,56,14,26,95,32,36,1,67,88};
        int n = arr.length;
        
        
         for (int i = 0; i < n-1; i++)
        {
             int min = i;
             for (int j = i + 1; j < arr.length; j++)
                 if (arr[j] < arr[min])
                    min = j;
                
                 
                int temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp; 
        }
  
         
       System.out.println("Sorted Array"); 
          
       for(int i=0; i < n; i++)
       {  
          System.out.print(arr[i] + ",");   
       }
        
        
    }
    
}
