package lib;
public class Cat extends Animal {
    private String color;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    
}
