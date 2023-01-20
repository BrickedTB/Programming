package insertionsortprac;

import java.util.Arrays;

public class InsertionSortPrac {

    public static void main(String[] args) {
        
        int[] arr = {2,34,4,56,14,26,95,32,36,1,67,88};
        int n = arr.length;
        
        for (int i = 1; i < n; i++) 
        { 
            int piv = arr[i]; 
            int j = i - 1; 
 
            while (j >= 0 && arr[j] > piv)
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = piv; 
        
        }
        
       System.out.println("Sorted Array"); 
          
       for(int i=0; i < n; i++)
       {  
          System.out.print(arr[i] + ",");   
       }
    }
    
}
