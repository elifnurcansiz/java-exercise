package deneme;

public class Maths {
    public static void main(String[] args) {

        Maths maths = new Maths();
        System.out.println(maths.additionNumbers());
        System.out.println(maths.multiplyNumbers());
        System.out.println(maths.divideNumbers());
    }

    public int multiplyNumbers() {
        int x = 5;
        int y = 3;
        int z = 6;
        int multiplyNumbers;
        multiplyNumbers = x * y * z;
        return multiplyNumbers;

    }

    public double additionNumbers() {
        double a = 8.5;
        double b = 7.1;
        double c = 6.2;
        double additonNumbers;
        additonNumbers = a + b + c;
        return additonNumbers;
    }

    public float divideNumbers() {
        float k = 100;
        float z = 5;
        float m = 2;
        float divideNumbers;
        divideNumbers = k / z / m;
        return divideNumbers;

    }
}
