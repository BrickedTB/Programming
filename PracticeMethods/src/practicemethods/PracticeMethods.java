package practicemethods;

public class PracticeMethods {
    
    int empId;
    String empName;

    PracticeMethods(int id, String name)
    {
        this.empId = id;
        this.empName = name;
    }
    
    void print(int num, String cat)
    {
        
        System.out.println("Name: " + empName + " ID: " + empId + " " + num + " " + cat);
    }
    
    
    public static void main(String[] args) {
        
        PracticeMethods obj = new PracticeMethods(57965,"Bob");
        PracticeMethods obj1 = new PracticeMethods(57965,"Bob");
        obj.print(5, "Cat");
        obj1.print(7, "Dog"); 
        
        
                
    }
    
}
