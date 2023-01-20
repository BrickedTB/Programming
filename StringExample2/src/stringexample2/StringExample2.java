package stringexample2;
public class StringExample2 {

    public static void main(String[] args) {
        String aString = "Here is some text.";
        String anotherString = "Here is some more text.";
        
        System.out.println(aString.charAt(2));
        
        System.out.println("The two stirngs match:" + aString.equals(anotherString));
        
        System.out.println("The length of the aString string variable is" + aString.length());
        
        System.out.println(aString.toUpperCase());
    }
    
}