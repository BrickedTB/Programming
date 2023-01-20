package addmatrices;
import java.util.Scanner;
public class AddMatrices {

    public static void main(String[] args) {
        int m,n,c,d;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and colums of matrix");
        m = keyboard.nextInt();
        n = keyboard.nextInt();
        
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];
        
        System.out.println("Enter the elements of first matrix");
        
        for (c = 0; c < m; c++)
            for(d = 0; d < n; d++)
                first[c][d] = keyboard.nextInt();
        
        System.out.println("Enter the elements second matrix");
        
      for (c = 0; c < m; c++)
            for(d = 0; d < n; d++)
                second[c][d] = keyboard.nextInt();
      
         for (c = 0; c < m; c++)
            for(d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];
         System.out.println("Sum of entered matricies = ");
         
        for (c = 0; c < m; c++)
        {
            for(d = 0; d < n; d++)
                System.out.print(sum[c][d] + "\t");
            System.out.println();
        }
      
    }
    
}
