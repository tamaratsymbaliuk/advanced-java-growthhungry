import javax.naming.InvalidNameException;

public class Student {

    String name;
    int age;

    public Student(String name, int age) {
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
