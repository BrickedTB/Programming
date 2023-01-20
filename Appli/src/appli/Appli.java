package appli;
public class Appli {

    public static void main(String[] args) {
        String str = new String ("Rs 1000");
        
        System.out.print("The original string is: ");
        System.out.println(str);
        
        System.out.print("The extracted substring is : ");
        System.out.println(str.substring(3));
    }
    
}
