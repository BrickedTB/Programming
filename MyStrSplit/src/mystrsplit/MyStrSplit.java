package mystrsplit;
public class MyStrSplit {
   public static void main(String[] args) {
       String str = "This program slits a string based on space";
       String[] tokens = str.split(" ");
       for(String s:tokens){
           System.out.println(s);
           
       }
       str = "This     program splits a string based on a space";
       tokens = str.split("\\s+");
    }
    
}
