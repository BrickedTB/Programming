package arrayindexelement; 

import java.util.Arrays;

public class ArrayIndexElement {

        public static int Index(int[] myArray, int n)
        {
            if(myArray == null)
            {
                return -1;
            }
            int len = myArray.length;
            int i = 0;
            
            while (i < len)
            {
                if (myArray[i] == n)
                {
                    return i+1;
                }
                
               i++;
               
            } 
            return -1;
        }
    
        public static void main(String[] args) {
        int[] myArray = {8,9,11,16,18,19,20,21,26};
        System.out.println("Index position of 18 is: " + Index(myArray, 18));
        System.out.println("Index position of 20 is: " + Index(myArray, 26));  

        
        
    }
    
}
