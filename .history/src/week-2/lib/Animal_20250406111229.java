package lib;
public abstract class Animal {
    private String species;
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    abstract public void eat();

    
}
