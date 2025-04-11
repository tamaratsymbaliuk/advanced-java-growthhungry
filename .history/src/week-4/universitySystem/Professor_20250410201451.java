 abstract class Professor implements Teach, Evaluatable {
    private String name;
    double salary;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void teachCourse() {
        System.out.println(name + " is teaching in the " + department + " department.");

    };

    public abstract double calculateSalary();

    @Override
    public void conductLecture() {
        System.out.println("Lecture is in progress");
    }

    @Override
    public void gradeStudents() {
        System.out.println("Grading students");
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department; 
    }




}
