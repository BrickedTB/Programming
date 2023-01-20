package indexofmethod;

public class IndexOfMethod {

    public static void main(String[] args) {
        String str1 = "This is a BeginnersBook Tutorial";
        String str2 = "Beginners";
        String str3 = "Book";
        String str4 = "Books";
        System.out.println("Index of B in str1: " + str1.indexOf('B'));
        System.out.println("Index of B in str1: after 15th char:" + str1.indexOf('B',15));
        System.out.println("Index of B in str1: after 30th char:" + str1.indexOf('B',30));
        System.out.println("Index of string str2 in str11:" + str1.indexOf(str2));
        System.out.println("Index of str2 after 15th char" + str1.indexOf(str2,15));
        System.out.println("Index of string str3:" + str1.indexOf(str3));
        System.out.println("Index of string str4:" + str1.indexOf(str4));
        System.out.println("Index of hardcorded string:" + str1.indexOf("is"));
        System.out.println("Index of hardcoded string after 4th char:" + str1.indexOf("is",4));
                
                
                
                
                
                
    }   
    
    
    
    
}
