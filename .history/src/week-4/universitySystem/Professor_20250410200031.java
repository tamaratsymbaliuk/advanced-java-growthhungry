public abstract class Professor implements Teach, Eva {
    String name;
    double salary;
    Department department;

    abstract void teachCourse();

    abstract double calculateSalary();

    @Override
    public void conductLecture() {
        System.out.println("Lecture is in progress");
    }




}
