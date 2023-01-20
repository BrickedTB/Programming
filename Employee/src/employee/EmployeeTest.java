package employee;
import java.io.*;
public class EmployeeTest {
    String name;
    int age; 
    String designation;
    double salary;


public EmployeeTest(String name)
{
    this.name = name;
}

public void empAge(int empAge)
{
    age = empAge;
}

public void empDesignation(String empDesig)
{
    designation = empDesig;
}

public void empSalary(double empSalary)
{
    salary = empSalary;
}

public void printEmployeeTest()
{
System.out.println("Name: " +name); 
System.out.println("Age: " + age);
System.out.println("Designation: " + designation);
System.out.println("Salary: " + salary);
}
}
