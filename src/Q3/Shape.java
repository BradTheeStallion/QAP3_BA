//Brad Ayers
//QAP3
//November 20-21, 2024

//The instructions for Q4 suggested that we didn't need to make the Shape class implement Scalable since it was abstract, but I chose to do so because it seemed to be the most straightforward way to solve the problem.

package Q3;
import Q4.Scalable;

public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}

