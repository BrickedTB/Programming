package mystringequals;

public class MyStringEquals {
    public static void main(String[] args) {
        String x = "JUNK";
        String y = "junk";
        
        if(x.equals(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        
        if(x.equalsIgnoreCase(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
            
        }
    }
    
}
