// java program to intialize emp details
package corejava;
import java.io.*;
class Employee 
{ 
	// Creating attributes
    private long employeeId,employeephone; 
    private String employeeName,employeeAddress; 
    private double basicSalary,specialAllowance,Hra;

    // creating an Default constructor method name emp
    Employee() 
    {
        employeeId = 0; 
        employeephone = 0; 
        employeeName = ""; 
        employeeAddress=""; 
        basicSalary=0.0; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    } 
 // Creating an overloaded constructor in the emp method
    Employee(long id,String n,String a,long p,double s) 
    {
    	
        employeeId = id; 
        employeephone = p; 
        employeeName = n; 
        employeeAddress=a; 
        basicSalary=s; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    }
 // creating method
    public double getBasicSalary()
    {
        return basicSalary;
    }

    public double calculateSalary()
    {
        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
        return salary;
    }

    public double calculateTransportAllowance()
    {
        return 0.01*basicSalary;
    }
}
// Creating the sub class Manager and Trainee with base class Employee.
class Manager extends Employee
{
    Manager(long id,String n,String a,long p,double s) 
    { 
        super(id,n,a,p,s);
    }
    
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getBasicSalary();
    } 
}
    class EmployeeInfo  
{
    // Create a class "EmployeeInfo.java" with a main method
    	public static void main(String[] args) {
        
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
        double salary = m.calculateSalary(); 
        System.out.println("Manager's Salary : "+salary);
        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
    }
}