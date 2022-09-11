package car;

public class Car {
    String model ;
    int year;
    String color;
    String make ;
    int speed;
    int distance;

    public Car() {
    }
    void accelerate (int newSpeed) {
        speed=speed+newSpeed;
    }
    void move (int x) {
        distance=distance +x;
    }


}
