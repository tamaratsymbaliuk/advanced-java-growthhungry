public class Department {
    private List<Course> courses;
    private List<Professor> professors;
   // private List<Course, Student> courseAndStudentsList = new ArrayLits<>();
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
    }


    
}
