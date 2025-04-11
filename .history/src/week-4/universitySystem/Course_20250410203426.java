import java.util.ArrayList;
public class Course {

    private List<Student> students;
    private Grade grade;
    Professor professor;
    private String courseName;
    private int creditHours;

    public Course(String courseName, int creditHours) {
        this.creditHours = creditHours;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public Grade getGrade() {
        return grade;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudents(Student )


    
    
}
