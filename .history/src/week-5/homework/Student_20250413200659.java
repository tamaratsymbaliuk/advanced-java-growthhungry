
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) throws InvalidNameException, InvalidAgeException {
        if (name == null || name.isEmpty()) {
throw new InvalidNameException("Name cannot be null or empty");
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
