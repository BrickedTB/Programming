package employee;

public class Employee {
    

    public static void main(String[] args) {
        EmployeeTest empOne = new EmployeeTest("James Smith");
        EmployeeTest empTwo = new EmployeeTest("Mary Anne");
        
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployeeTest();
        
        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployeeTest();
        
    }
    
}
