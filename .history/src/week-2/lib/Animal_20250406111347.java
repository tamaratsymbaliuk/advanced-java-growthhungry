package lib;
public abstract class Animal {
    private String species;
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    abstract public void eat(); // abstract method doesn't need implementation 

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies (String species) {
        
    }
}
