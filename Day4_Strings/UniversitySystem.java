class Ques1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 50; // Accessing an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        }
    }
}


// Interface for grading
// interface Graded {
//     void assignGrade(Student student, String courseCode, double grade);
// }

// // Abstract Class Student
// abstract class Student {
//     private String name;
//     private int id;
//     private double totalGradePoints = 0;
//     private int totalCredits = 0;
//     private String electivePreference;

//     public Student(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }

//     public Student(String name, int id, String electivePreference) {
//         this(name, id);
//         this.electivePreference = electivePreference;
//     }

//     // GPA Calculation: Encapsulation
//     public void addGrade(double gradePoint, int credits) {
//         totalGradePoints += gradePoint * credits; // operator *
//         totalCredits += credits;
//     }

//     public double getGPA() {
//         if (totalCredits == 0) return 0.0;
//         return totalGradePoints / totalCredits; // operator /
//     }

//     public void printTranscript() {
//         System.out.println("Transcript for " + name);
//         System.out.println("GPA: " + getGPA());
//     }

//     public String getName() {
//         return name;
//     }

//     public int getId() {
//         return id;
//     }
// }

// // Inheritance: Undergraduate student
// class Undergraduate extends Student {
//     public Undergraduate(String name, int id) {
//         super(name, id);
//     }

//     public Undergraduate(String name, int id, String electivePreference) {
//         super(name, id, electivePreference);
//     }
// }

// // Inheritance: Postgraduate student
// class Postgraduate extends Student {
//     public Postgraduate(String name, int id) {
//         super(name, id);
//     }

//     public Postgraduate(String name, int id, String electivePreference) {
//         super(name, id, electivePreference);
//     }
// }

// // Course Class
// class Course {
//     private String courseCode;
//     private String courseName;
//     private int credits;

//     public Course(String courseCode, String courseName, int credits) {
//         this.courseCode = courseCode;
//         this.courseName = courseName;
//         this.credits = credits;
//     }

//     public int getCredits() {
//         return credits;
//     }

//     public String getCourseCode() {
//         return courseCode;
//     }

//     public String getCourseName() {
//         return courseName;
//     }
// }

// // Faculty Class implements Graded interface
// class Faculty implements Graded {
//     private String name;

//     public Faculty(String name) {
//         this.name = name;
//     }

//     @Override
//     public void assignGrade(Student student, String courseCode, double grade) {
//         System.out.println("Assigning grade for " + student.getName() + " in " + courseCode);
//         Enrollment.addGradeToStudent(student, courseCode, grade);
//     }
// }

// // Enrollment Class
// class Enrollment {
//     public static void enrollStudent(Student student, Course course) {
//         System.out.println("Enrolling " + student.getName() + " to course: " + course.getCourseName());
//         // In real-world: store enrollment in DB or data structure
//     }

//     public static void addGradeToStudent(Student student, String courseCode, double grade) {
//         // For simplicity, assuming all courses have 3 credits
//         int credits = 3;
//         student.addGrade(grade, credits);
//     }
// }

// // Main Driver
// public class UniversitySystem {
//     public static void main(String[] args) {
//         // Creating Courses
//         Course java = new Course("CS101", "Java Programming", 3);
//         Course ml = new Course("CS202", "Machine Learning", 3);

//         // Creating Students
//         Undergraduate ug = new Undergraduate("Alice", 101, "Data Science");
//         Postgraduate pg = new Postgraduate("Bob", 201);

//         // Creating Faculty
//         Faculty profJohn = new Faculty("Prof. John");

//         // Enrolling students
//         Enrollment.enrollStudent(ug, java);
//         Enrollment.enrollStudent(pg, ml);

//         // Faculty assigning grades
//         profJohn.assignGrade(ug, java.getCourseCode(), 8.5);
//         profJohn.assignGrade(pg, ml.getCourseCode(), 9.0);

//         // Print Transcripts
//         ug.printTranscript();
//         pg.printTranscript();
//     }
// }