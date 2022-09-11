package point;

public class PointTest {

    public static void main(String[] args) {
        Point point1 = new Point(34.0, 42.0);
        Point point2 = point1.clone();
        point2.move(-6.0, 8.0);

        double distance = point1.distance(point2);
        System.out.printf("Distance between points: %f%n", distance);
    }
}
