package equalsexample;

public class Equalsexample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hi";
        String str3 = "Hello";
        System.out.println("str1 equals to str2:" + str1.equals(str2));
        System.out.println("str1 equals to str3:" + str1.equals(str3));
        System.out.println("str1 equals to Welcome:" + str1.equals("Welcome"));
        System.out.println("str1 equals to Hello:" + str1.equals("Hello"));
        System.out.println("str1 equals to hello:" + str1.equals("hello"));
        
        
        
    }
    
    
}
