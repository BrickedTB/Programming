package mychararraycopy;
public class MyCharArrayCopy {
    public static void main(String[] args) {
        String str = "Copy chars from this string";
        char[] ch = new char[5];
        str.getChars(5, 10, ch, 0);
        System.out.println(ch);
        
    }
    
}
