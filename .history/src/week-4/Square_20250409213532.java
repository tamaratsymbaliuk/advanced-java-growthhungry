public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getShapeType() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.println("")
    }

    
}
