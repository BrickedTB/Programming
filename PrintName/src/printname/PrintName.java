package printname;
import java.util.Scanner;
public class PrintName {
    
    private static Name getName()
    {
    String first;
    String last;
    String middle;
    Scanner in;
    in = new Scanner(System.in);

    System.out.print("Enter first name");
    first = in.nextLine();
    System.out.print("Enter last name");
    last = in.nextLine();
    System.out.print("Enter middle name");
    middle = in.nextLine();
    in.close();
    return new Name(first, last, middle);
    
    }
    
    public static void main(String[] args) 
    {
        Name myName;
        myName = getName();
        
        System.out.println("Name in first-last format is " +
                            myName.getFirstName() + " " + 
                            myName.getLastName());
        System.out.println("Name in last-first-middle format is " + 
                            myName.getLastName() + ", " + 
                            myName.getFirstName() + ", " +
                            myName.getMiddleName()); 
        
    }
}
    

