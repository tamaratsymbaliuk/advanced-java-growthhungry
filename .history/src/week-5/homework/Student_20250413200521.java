import javax.naming.InvalidNameException;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) thr{
        if (name!= null && !name.isEmpty()) {
            this.name = name;
        } else{
            throw new InvalidNameException(e);
        }
        if (age < 18 && age >60) {
            throw new InvalidAgeException(e);
        } else {
            this.age = age;
        }
    }
}
