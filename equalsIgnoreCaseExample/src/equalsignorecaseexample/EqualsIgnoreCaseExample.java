package equalsignorecaseexample;

public class EqualsIgnoreCaseExample {

    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "MANGO";
        String str3 = "APPLE";
        System.out.println("str1 equals to str2:" + str1.equalsIgnoreCase(str2));
        System.out.println("str1 equals to str3:" + str1.equalsIgnoreCase(str3));
        System.out.println("str1 equals to Welcome:" + str1.equalsIgnoreCase("Welcome"));
        System.out.println("str1 equals to Apple:" + str1.equalsIgnoreCase("Apple"));
        System.out.println("str2 equals to mango:" + str2.equalsIgnoreCase("mango"));
    }
    
}
