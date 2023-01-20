package autoclient;

public class Autoclient {

    public static void main(String[] args) 
    {
        Auto sporty = new Autoclient("Spyder", 0, 0.0);
        System.out.println(sporty.toString());
        
        Auto compact = new Auto("Accent", 0, 0.0);
        System.out.println(); 
        System.out.println(compact);
        
        if(compact.equals(sporty))
 
            System.out.println("\nsporty and compact are equal");
            else
            System.out.println("\nsporty and compact are not equal");
        }   
}
