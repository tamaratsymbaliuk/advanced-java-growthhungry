public class Rectangle extends Shape implements Drawable {
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        
    }
    
}
