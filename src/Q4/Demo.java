package Q4;
import Q3.*;

public class Demo {
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("Scaling all shapes by a factor of " + factor + "...\n");
        for (Scalable shape : shapes) {
            System.out.println("Before scaling: " + shape);
            shape.scale(factor);
            System.out.println("After scaling: " + shape + "\n");
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[] {
            new Circle(5.0),
            new Ellipse(7.0, 3.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(6.0)
        };

        scaleShapes(shapes, 2.0);
    }
}

