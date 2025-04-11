import java.util.HashMap;
public class Student {
    private String studentName;
    private int studentId;
    private HashMap<Course, Integer> grades;


    public Student(String studentName, int studentID) {

        this.studentName = studentName;

        this.studentId = studentID;

        this.grades = new HashMap<>();

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = name;
    }

    public String getGradeReport() {
        for (Course course : courses) {
            System.out.println("Course name : " + course + " and grade: " + course.getGrade());

        }
    }

    public void registerCourse (Course name) {
        courses.add(name);
    }

    public void addGrade(Course course, int grade) {

        grades.put(course, grade);

    }
    
}
