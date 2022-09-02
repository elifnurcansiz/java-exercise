package algorithm;

import java.util.Scanner;

public class MonteCarloPi {
    public static void main(String[] args) {
        System.out.println("Enter the number of points");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();


        int n = scanner.nextInt();
        int numberINcircle = 0;
        long start =System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            double x =Math.random();
            double y= Math.random();
            double distance = (x*x+y*y);
            if (distance <=1)
                numberINcircle++;



        }
        long end=System.currentTimeMillis();
        long time =end-start;
        double myPI =4.0*numberINcircle/n;
        System.out.println("My pi: " +myPI);
        System.out.println("java's PI : "+Math.PI);
        System.out.println("Time" +time +"ms.");

    }
}
