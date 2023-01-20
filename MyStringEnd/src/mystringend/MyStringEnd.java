package mystringend;
public class MyStringEnd {
    public static void main(String[] args) {
        String str = "This is a java string example"; 
        if(str.endsWith("example")){
            System.out.println("This String ends with example");
        } else {
            System.out.println("This string is not ending with example");
        }
         if(str.endsWith("java")){
            System.out.println("This String ends with java");
        } else {
            System.out.println("This string is not ending with java");
        }
    }
    
}
