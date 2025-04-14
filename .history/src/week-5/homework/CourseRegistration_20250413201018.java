import java.util.ArrayList;
public class CourseRegistration {
    private List<Student> registeredStudents = new ArrayList<>();
    private static final int MAX_STUDENTS = 5;

    public void registerStudent(Student student) throws CourseFullException {
        if (registeredStudents.size() >= MAX_STUDENTS) {
            throw new CourseFullException("This course is full");
        }

        registeredStudents.add(student);
        System.out.println("Student " + student.getName() + "registered successfully.");
    }

    public int getRegisteredCount() {
     return students.size();
    
}
