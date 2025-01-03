//Brad Ayers
//QAP3
//November 20-21, 2024

package Q3;

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}
