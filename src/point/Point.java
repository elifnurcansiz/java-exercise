package point;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double diffX = this.x - point.getX();
        double diffY = this.y - point.getY();

        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public Point clone() {
        return new Point(this.x, this.y);
    }

    public void move(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
