package systemofequations;
import java.util.Scanner; 
public class SystemOfEquations {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double a,b,s,t,c,d,dx,dy,d1,x,y;
        
        System.out.println("ax+by = s");
        System.out.println("cx+dy = t");
        System.out.println("Enter values for a,b and s");
        
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        s = keyboard.nextDouble();
        
        System.out.println("Now enter values for c,d and t");
        
        c = keyboard.nextDouble();
        d = keyboard.nextDouble();
        t = keyboard.nextDouble();
        
        dx = (s * d) - (b * t);
        dy = (a * t) - (c * s);
        
        d1 = (a * d) - (c * b);
        
        x = dx/d1;
        y = dy/d1;
        
        System.out.println("(x,y) = (" + x + ")," + "(" + y+ ")");
        
        
    }   
    
}