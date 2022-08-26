package car;

public class CarTest {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.make = "Mercedes";
        car1.model="Benz";
        car1.year= 2022;
        car1.color="Blue";
        car1.distance=35;
        car1.speed=250;
        System.out.println("speed of car " + car1.speed +" kmh");
        System.out.println("distance of car " + car1.distance +" km");
        car1.accelerate(10);
        System.out.println("speed of car " + car1.speed +" kmh");
        car1.move(15);
        System.out.println("distance of car " + car1.distance +" km");
    }
}
