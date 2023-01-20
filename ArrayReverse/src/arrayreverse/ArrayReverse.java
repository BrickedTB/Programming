package arrayreverse;
import java.util.Arrays;
public class ArrayReverse {

    public static void main(String[] args) {
        int myArray[] = {4,8,10,12,16,18,20,29,31,37,39};
        int Revarray[] = new int[11];

        
        System.out.println("The Array = " + Arrays.toString(myArray));
             
        for(int i = 0; i < myArray.length; i++)
        {
         Revarray[i] = myArray[myArray.length - i -1];
        }
        
       System.out.println("The Reverse Array = " + Arrays.toString(Revarray));
    }
}
