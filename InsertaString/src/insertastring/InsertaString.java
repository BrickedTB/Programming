package insertastring;

public class InsertaString {

    public static void main(String[] args) {
        String originalString = "JavaCode";
        String stringToBeInserted = "For";
        int index = 4;
        
        System.out.println("Original String: "
                + originalString);
        System.out.println("String to be inserted: "
                + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                + index);
        
        System.out.println("Modified String: " + insertString(originalString,stringToBeInserted,index));
        
        
        
    }
    
}
