package spaceboxing;
import java.util.Scanner;
public class SpaceBoxing {

    public static void main(String[] args) {
        int pick;
        double w,Ven,Mar,Jup,Sat,Ura,Nep,ans;
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("# Planet Relative gravity");
        System.out.println("1 Venus   0.78");
        System.out.println("2 Mars    0.39");
        System.out.println("3 Jupiter 2.65");
        System.out.println("4 Saturn  1.17");
        System.out.println("5 Uranus  1.05");
        System.out.println("6 Neptune 1.23");
        
        System.out.println("Enter weight(lbs)");
        w = keyboard.nextDouble();
        
        System.out.println("Enter 1-6 for planet");
        pick = keyboard.nextInt();
        
        if (pick == 1)
        {
           ans = (w * 0.78);
           System.out.println("Your new weight is: " + ans);
        }
        if (pick == 2)
        {
           ans = (w * 0.39);
           System.out.println("Your new weight is: " + ans);
        }
        if (pick == 3)
        {
           ans = (w * 2.65);
           System.out.println("Your new weight is: " + ans);
        }
        if (pick == 4)
        {
           ans = (w * 1.17);
           System.out.println("Your new weight is: " + ans);
        }
        if (pick == 5)
        {
           ans = (w * 1.05);
           System.out.println("Your new weight is: " + ans);
        }
        if (pick == 6)
        {
           ans = (w * 1.23);
           System.out.println("Your new weight is: " + ans);
        }
        
        
        
    }
    
}



