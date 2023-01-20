package pentagonalnumbers;

public class PentagonalNumbers {

    public static void main(String[] args) {
        
        int num = 1; 
        System.out.println("The first 50 pentagonal numbers are: " + penta(num));
    
    }
    
        public static int penta(int num)
    {
        int count = 1;
        for(int i = 1; count <= 50; i++)
        {
           num = (i * (3 * i - 1)) / 2; 
            
           count++;
           System.out.println(" " + num);
        }
        return num;
    }
    
}
