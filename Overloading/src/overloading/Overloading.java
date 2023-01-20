package overloading;

public class Overloading {
    
    public Overloading()
    {
        System.out.println("Inside default constuctor");
    }
    public Overloading(int i)
    {
        System.out.println("Inside single parameter constructor with int value");
    }
    public Overloading(String str)
    {
        System.out.println("Inside single parameter constructor with String object");
    }
    public Overloading(int i, int j)
    {
        System.out.println("Inside double parameter constuctor");
    }
    public static void main(String[] args) {
        Overloading mco = new Overloading(); 
        Overloading spmco = new Overloading(10); 
        Overloading dpmco = new Overloading(10,20); 
        Overloading dpmco = new Overloading("java2novice");
}
}
