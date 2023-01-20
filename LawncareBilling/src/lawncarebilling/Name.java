package lawncarebilling;

public class Name {
        
        String first;
        String middle;
        String last;
        
        static final String SEP = ", ";
    
        public Name()
        {
    
            first = " ";
            last = " ";
            middle = " ";
            
        }
        public Name(String firstName, String lastName, String middleName)
        {
            first = firstName;
            last = lastName; 
            middle = middleName;
        }
        
        public static void printSep(String label)
        {
            String message = label + " \"" + SEP + "\"";
            System.out.println(message);
        }
       
        public void printName(String label)
        {
            String name;
            name = last + SEP + first + SEP + middle;
            System.out.println(label + name);
        }
        
        public void printName()
        {
            System.out.println(last + SEP + first + SEP + middle);
        }
        
    }
    
