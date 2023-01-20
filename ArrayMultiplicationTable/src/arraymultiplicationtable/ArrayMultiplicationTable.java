package arraymultiplicationtable;
import java.util.*;

public class ArrayMultiplicationTable {

    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int bound;
        
        Scanner b = new Scanner(System.in);
        System.out.println("Enter bound");
        bound = b.nextInt();
        
        int mult[][] = new int[bound][bound]; 
    
        
        for (int x = 0; x < bound; x++)
         {
         for (int y = 0; y < bound; y++)  
           {           
            int num = x * y;
            if(num < 10)
            {
                System.out.print("   ");
            }
            if(num >= 10)
            {
                System.out.print("   "); 
           }
            mult[row][col] = (x + 1) * (y + 1);
            System.out.print(mult[row][col]);
  
           }
        System.out.println(" ");
         }
        
        

    }
    
}
