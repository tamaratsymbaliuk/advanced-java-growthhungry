import java.util.HashMap;
public class Student {
    private String studentName;
    private String studentId;
    List<Course> courses = new ArrayList<>();

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public String getGradeReport() {
        for (Course course : courses) {
            System.out.println("Course name : " + course + " and grade: " + course.getGrade());

        }
    }

    public void registerCourse (Course name) {
        courses.add(name);
    }
    
}
