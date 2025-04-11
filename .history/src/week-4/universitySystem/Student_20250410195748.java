public class Student {
    private String name;
    private String studentId;
    List<Course> courses = new ArrayList<>();

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }
    
}
