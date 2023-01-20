package chaining;

public class Chaining {

    public Chaining()
    {
        System.out.println("In default constructor...");
    }
    public Chaining(int i)
    {
        this();
        System.out.println("In single parameter constructor...");
    }
    public Chaining(int i, int j)
    {
        this(j);
        System.out.println("In double parameter constructor...");
    }
    public static void main(String[] args) {
        Chaining ch = new Chaining(10,20);
    }
    
}
