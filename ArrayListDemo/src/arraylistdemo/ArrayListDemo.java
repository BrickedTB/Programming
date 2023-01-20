package arraylistdemo;
import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(8);
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(10);
        arrlist.add(15); 
        
        for(Integer number: arrlist)
        {
            System.out.println("Number = " + number);
        }
        
        boolean retval = arrlist.contains(10);
        if (retval == true)
        {
            System.out.println("element 10 is contained in the list");
        }
        else
        {
            System.out.println("element 10 is not contained in the list");
        }
        
        boolean retval2 = arrlist.contains(30);
         if (retval2 == true)
        {
            System.out.println("element 30 is contained in the list");
        }
        else
        {
            System.out.println("element 30 is not contained in the list");
        }
        
    }
    
}
