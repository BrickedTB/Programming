package midtermsum;

import java.util.Arrays;

public class MidtermSum2 {

    public static void main(String[] args) {
        int arr[] = {10,22,35,66,37,15,11};
        int sum = 0;
      
        
            for(int i = 0; i < arr.length; i++)
          {
              if (arr[i] > 9)
              {
                  if (arr[i] < 20)
                  {
                      sum += arr[i];
                  }
                  
              }
          }
            if(sum == 30)
            {
                System.out.println("true");
            }
            
            if(sum != 30)
            {
                System.out.println("false");
            }
        
        
        
        
        
        
    }
    
}
