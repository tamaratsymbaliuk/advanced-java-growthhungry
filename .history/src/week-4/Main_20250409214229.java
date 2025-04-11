public class Main {

    public static void main(String[] args) {
        // creating different shapes
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4 , 7);
        Shape square = new Square(4);

        // Adding shapes to a list
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
    }
    
}
