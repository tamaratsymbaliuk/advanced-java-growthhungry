abstract class Shape {

    String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    abstract double calculateArea();
    abstar double calculatePerimeter();
}
