package arraylistdetails;
import java.util.ArrayList;
public class ArrayListDetails {

    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<String>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");
        
        ArrayList<String> arraylist2 = new ArrayList<String>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");
        
        ArrayList<String> al = new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);
        
        for(String temp: al)
        {
            System.out.println(temp);
        }
        
    }
    
}
