//Brad Ayers
//QAP3
//November 20-21, 2024

package Q3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5.0),
            new Ellipse(7.0, 3.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(6.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

