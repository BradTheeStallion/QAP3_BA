//Brad Ayers
//QAP3
//November 20-21, 2024

package Q2;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1f, 2f);
        System.out.println("Initial Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1f, 2f, 1f, 1f);
        System.out.println("Initial MovablePoint: " + movablePoint);

        movablePoint.move();
        System.out.println("After Move: " + movablePoint);

        movablePoint.move();
        System.out.println("After Another Move: " + movablePoint);
    }
}
