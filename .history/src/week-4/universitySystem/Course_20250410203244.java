import java.util.ArrayList;
public class Course {

    List<Student> students = new ArrayList<>();
    private Grade grade;
    Professor professor;

    private String courseName;
    private int creditHours;

    public Grade getGrade() {
        return grade;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }


    
    
}
