import java.util.ArrayList;
public class CourseRegistration {
    private List<Student> registeredStudents = new ArrayList<>();
    private static final int MAX_STUDENTS = 5;

    public void registerStudent(Student student) throws CourseFullException {
        if (registeredStudents.size() > ) {
            throw new CourseFullException("This course is full");
        }

        registeredStudents.add(student);
    }
    
}
