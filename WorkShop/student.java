package WorkShop;

   
   
   public class student{
    private String name;
    private int id;
    private char grade;
    public student(String name,int id,char grade){
      this.name=name;
      this.id=id;
     
    }

    public String getName(){
      return name;
    }

    public int getId(){
      return id;
    }

    public char getGrade(){
      return grade;
    }


   }

   


    class Course {
    private String title;
    private String code;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }
}


    public class faculty{
      private String facultyName;
      private String course;
      private String assignGrades;
      public faculty(String facultyName,String course,String assignGrades){
         this.facultyName=facultyName;
         this.course=course;
         this.assignGrades=assignGrades;
      }
    }



   
    


  



public class UniversityCourseManagement {
   public static void main(String[] args) {
        
    }
}
   

//university course enrollment system
// enroll in course and faculty can assign grades
// class student course faculty enrollment
// constructure used to create students with/without elective pref
// access modifiers private for internal gpa fields public ,method to access transcript
// interface graded wioth method assignGrade()
// operators gpa calculations and comparision (using +,/,etc)
// OOPS
// Encap:Secure handlihng of grades
// Inherietence Undergraduate Postgraduate extend student