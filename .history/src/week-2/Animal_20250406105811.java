public abstract class Animal {
    private String species;
    protected String name;

    protected Anima(String name) {
        this.name = name;
    }

    abstract public void eat();
}
