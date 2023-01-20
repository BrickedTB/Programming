package tostringexample;

public class ToStringExample {

    public static void main(String[] args) {
        double dvar = 101.11;
        String str = String.valueOf(dvar);
        System.out.println("String is: " + str);
        
        double dvar2 = 200.202;
        String str2 = Double.toString(dvar2);
        System.out.println("String2 is: " + str2);
        
    }
    
}
