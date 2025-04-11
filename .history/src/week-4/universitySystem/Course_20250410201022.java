public class Course {

    List<Student> students = new ArrayList<>();
    private Grade grade;
    Professor professor;

    private String name;
    private double creditHours;

    public Grade getGrade() {
        return grade;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor

    }


    
    
}
