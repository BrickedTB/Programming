package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class Arraylist {
    
    public static void main(String[] args) {
    
        ArrayList listTest = new ArrayList();
        
        listTest.add("first item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);
        
        Iterator it = listTest.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        listTest.remove("second item");
        
        System.out.println("While list = " + listTest);
        
        System.out.println("Position = " + listTest.get(1));
    }
    
}
