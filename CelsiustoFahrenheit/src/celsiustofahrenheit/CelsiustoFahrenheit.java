package celsiustofahrenheit;
import java.util.Scanner;
public class CelsiustoFahrenheit {

    public static void main(String[] args) {
        int C, F, pick;
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahenheit");
        System.out.println("2. Fahenheit to Celsius");
        
        pick = keyboard.nextInt();
        
        if (pick == 1){
        System.out.println("Enter Celsius");
        C = keyboard.nextInt();
        System.out.println(F = (C * 9/5) + 32);
        System.out.println(C + "° Celsius = " + F + "° Fahrenheit");
        
        }
        if (pick == 2){
        System.out.print("Enter Fahrenheit");
        F = keyboard.nextInt();
        System.out.println(C = (F - 32) * 5/90);
        System.out.println(F + "° Fahrenheit = " + C + "° Celsius");
        }
     
        
    }
    
}
