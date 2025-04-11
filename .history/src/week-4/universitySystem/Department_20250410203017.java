public class Department {
    private List<Course> courses;
    private List<Professor> professors;
   // private List<Course, Student> courseAndStudentsList = new ArrayLits<>();
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        // ensure that each Department instance has its own unique lists
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    public void addCourse(Course course) {
        courses.add(course);

    }



    
}
