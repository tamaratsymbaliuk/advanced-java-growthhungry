abstract class Shape {

    String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getShapeType() {
        return shapeType;
    }
}

interface Drawable {
    void drwa
}
