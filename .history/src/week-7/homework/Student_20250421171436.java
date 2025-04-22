package homework;

public class Student {
    private int id;
    private String name;
    private double grade;
    private int age;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name is: " + name + ", id is: " + id + " age is " + age + ", grade is: " + grade;
    }

    public static Student fromString(String data) {
        String[] fields = data.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        int age = Integer.parseInt(fields[2]);
        double grade = Double.parseDouble

    }
    
}
