package mystringbytes;

public class MyStringBytes {
    public static void main(String[] args) {
        String str = "core java api";
        byte[] b = str.getBytes();
        System.out.println("String length: " + str.length());
        System.out.println("Byte array length: " + b.length);
    }
    
}
