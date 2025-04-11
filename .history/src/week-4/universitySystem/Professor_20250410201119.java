 abstract class Professor implements Teach, Evaluatable {
    private String name;
    double salary;
    Department department;

    abstract void teachCourse();

    abstract double calculateSalary();

    @Override
    public void conductLecture() {
        System.out.println("Lecture is in progress");
    }

    @Override
    public void gradeStudents() {
        System.out.println("Grading students");
    }




}
