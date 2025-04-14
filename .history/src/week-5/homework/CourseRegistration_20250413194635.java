public class CourseRegistration {
    List<Student> registeredStudents = new ArrayList<>();

    public void registerStudent(Student student) {
        if (registeredStudents.size() > 5) {
            throw new CourseFullException("This course is full");
        }

        registeredStudents.add(student);
    }
    
}
