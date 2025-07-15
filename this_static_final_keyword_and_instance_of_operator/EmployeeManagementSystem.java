package OOPS.this_static_final_keyword_and_instance_of_operator;

class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void printDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Yash", 101, "Developer");
        Employee e2 = new Employee("Riya", 102, "Tester");

        e1.printDetails();
        System.out.println();
        e2.printDetails();

        Employee.displayTotalEmployees();
    }
}
