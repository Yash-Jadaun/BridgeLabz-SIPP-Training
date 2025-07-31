package Java_Generics;

abstract class CourseType {
    String title;
    CourseType(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }
}

class CourseManager {
    public void printCourses(java.util.List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getTitle());
        }
    }
}
