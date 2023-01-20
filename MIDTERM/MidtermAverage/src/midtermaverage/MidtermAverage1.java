package midtermaverage;

import java.util.Arrays;

public class MidtermAverage1 {

    public static void main(String[] args) {
        int arr[] = {10,12,15,16,17,19};
        int sum = 0;
        
        for(int i = 1; i < 5; i++)
        {
        
        sum += arr[i];
        
        }
        System.out.println("The average of the array minus the largest and smallest values is " + sum/4);
        
    }
    
}
