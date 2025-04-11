public class Circle extends Shape implements Drawable { 
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() { return Math.PI * radius * radius; };
    
}
