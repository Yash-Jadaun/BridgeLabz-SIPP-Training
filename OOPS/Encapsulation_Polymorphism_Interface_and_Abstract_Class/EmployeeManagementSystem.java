package OOPS.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

// Department interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class Employee
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Department methods
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: ₹" + calculateSalary());
        System.out.println("--------------------------");
    }
}


class FullTimeEmployee extends Employee {
    private double fixedBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
        super(employeeId, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphic list
        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmployee(101, "Amit", 30000, 10000);
        employees[0].assignDepartment("Engineering");

        employees[1] = new PartTimeEmployee(102, "Riya", 500, 40);
        employees[1].assignDepartment("Support");

        employees[2] = new FullTimeEmployee(103, "Rahul", 25000, 8000);
        employees[2].assignDepartment("Finance");

        // Polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}