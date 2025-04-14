public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        if (name!= null && !name.isEmpty()) {
            this.name = name;
        } else{
            throw new Exception()
        }


        this.age = age;
    }
    
}
