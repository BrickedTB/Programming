package classcat;

public class ClassCat {
    
    String color;
    String name;
    int age;
    
    static int count = 0;
    
    public static void main(String[] args) {
        
        ClassCat smudge = new ClassCat();
        smudge.age = 3;
        smudge.name = "Smudge";
        smudge.color = "Black & White";
        count++;
        
        ClassCat fluffy = new ClassCat();
        fluffy.age = 5;
        fluffy.name = "Fluffy";
        fluffy.color = "White";
        count++; 
      
        ClassCat fudge = new ClassCat();
        fudge.age = 3;
        fudge.name = "Fudge";
        fudge.color = "Brown";
        count++;
        
        System.out.println("We created a cat named " + smudge.name + ". His age is " + smudge.age + "."
                + " He is the color " + smudge.color);
        System.out.println("We created a cat named " + fluffy.name + ". His age is " + fluffy.age+ "."
                + " He is the color " + fluffy.color);
        System.out.println("We created a cat named " + fudge.name + ". His age is " + fudge.age + "."
                + " He is the color " + fudge.color);
        
        System.out.println("Total number of cats = " + count);
        System.out.println("The combined age of the cats = " + (smudge.age + fluffy.age + fudge.age));
        
        
    }
    
}
