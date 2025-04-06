package lib;
public abstract class Animal {
    private String species;
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    abstract public void eat(); // abstract method 

    public void setName(String name) {
        this.name = name;
    }
}
