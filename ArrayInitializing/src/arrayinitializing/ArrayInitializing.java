package arrayinitializing;

public class ArrayInitializing {

    public static void main(String[] args) {
        int aiFirstArray[] = new int[6];
        
        for(int i = 0;i<aiFirstArray.length; i++)
        {
            aiFirstArray[i] = i+1;
        }
        
        for (int i=0; i<aiFirstArray.length;i++)
        {
            System.out.println(aiFirstArray[i]);
        }
    }
    
}
