public class Circle extends Shape implements Drawable { 
    private double radius;

    public Circle(double radius) {
        getSh
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() { return Math.PI * radius * radius; };

    @Override
    double calculatePerimeter() { return 2 * Math.PI * radius; };

    @Override
    public void draw() { System.out.println("Drawing a Circle with radius"); };

    
}
