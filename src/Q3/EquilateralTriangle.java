//Brad Ayers
//QAP3
//November 20-21, 2024

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