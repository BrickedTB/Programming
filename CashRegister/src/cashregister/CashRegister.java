package cashregister;
import javax.swing.JOptionPane;
public class CashRegister {

    public static void main(String[] args) {
        int paid, owed, change, doll, quart, dime, nick, penn, holdChange;
        String paidStr, owedStr;
        
        owedStr = JOptionPane.showInputDialog(null, " Enter the total owed in cents: ");
        paidStr = JOptionPane.showInputDialog(null, "Enter the amount paid by the customer in cents");
        
        paid = Integer.parseInt(paidStr);
        owed = Integer.parseInt(owedStr);
        
        holdChange = paid - owed;
        change = holdChange;
        
        doll = change / 100;
        change = change - doll * 100;
        quart = change / 25;
        change = change - quart * 25;
        dime = change / 10;
        change = change - dime * 10;
        nick = change / 5;
        penn = change - nick * 5;
        
        JOptionPane.showMessageDialog(null, "The total change is " + holdChange + " cents\nThat is " + doll + " Dollars, " +
         quart +  " Quarters, " + dime + " Dimes, " + nick + " Nickles, " + penn + " Pennies ");
            
        
    }
    
}
