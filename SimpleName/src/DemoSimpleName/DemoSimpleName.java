package DemoSimpleName;

public class DemoSimpleName {
    public static void main(String[] args)
    {
    SimpleName someName = new SimpleName("Ananda", "Reynolds", "Fiona");
    someName.printName("Name is: ");
    someName.printName();
    SimpleName.printSep("The seperator string is:");
    System.out.println("Done!");
}
}
