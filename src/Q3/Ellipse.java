package Q3;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2.0);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}

