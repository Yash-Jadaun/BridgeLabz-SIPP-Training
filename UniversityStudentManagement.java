package OOPS;

class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }
}

public class  UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 301, "A");
        Student s2 = new Student("Priya", 302, "B");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
