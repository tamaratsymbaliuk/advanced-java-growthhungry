public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        if (name!= null && !name.isEmpty()) {
            this.name = name;
        } else{
            throw new Exception(e);
        }
        if (age < 18 && age )


        this.age = age;
    }
    
}
