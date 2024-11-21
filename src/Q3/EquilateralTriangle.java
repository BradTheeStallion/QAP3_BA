package Q3;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return "Shape: Equilateral Triangle, Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}