package michaelgellenbeck;
import javax.swing.JOptionPane;
public class MichaelGellenbeck {

    public static void main(String[] args) {
    String firstName,middleName,lastName,upper,lower;
    char i1,i2,i3;
    int len;
    firstName = JOptionPane.showInputDialog(null,"Enter your first name: ");
    middleName = JOptionPane.showInputDialog(null,"Enter your middle name: ");
    lastName = JOptionPane.showInputDialog(null,"Enter your last name: ");

    i1 = firstName.charAt(0);
    i2 = middleName.charAt(0); 
    i3 = lastName.charAt(0);
    
    upper = firstName.toUpperCase() + " " + middleName.toUpperCase() + " " +
            lastName.toUpperCase();
    lower = firstName.toLowerCase() + " " + middleName.toLowerCase() + " " +
            lastName.toLowerCase();
    
    len = upper.length();
    
    System.out.println("Hello " + firstName + " " + middleName + " " + lastName);
    System.out.println("Your initials are " + i1 + i2 + i3);
    System.out.println("Upper case is " + upper);
    System.out.println("Lower case is " + lower);
    System.out.println("Your full name has " + len + " characters");
    

    
    }
    
}
