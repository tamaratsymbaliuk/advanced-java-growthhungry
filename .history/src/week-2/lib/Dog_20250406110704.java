package lib;
public class Dog extends Animal {

    protected Dog(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("Dog" + is eating");
    }
}