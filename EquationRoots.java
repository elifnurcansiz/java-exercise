package mathematicalcalculation;

import java.util.Scanner;

public class EquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(ax*x+bx+c) is a quadratic equation. /n Enter the constants in the equation in order as fallows");
        System.out.println("a enter value :");
        double a = scanner.nextInt();
        System.out.println("b enter value :");
        double b= scanner.nextInt();
        System.out.println("c enter value :");
        double c =scanner.nextInt();
        double delta=(b*b)-(4*a*c);
        if (delta>0) {
            double x1=((-1*b) -Math.sqrt(delta))/(2*a);
            double x2=((-1*b) + Math.sqrt(delta))/(2*a);
            System.out.println("x1= "+ x1 +"x2= " +x2);

        }
        if (delta<0){
            System.out.println("the equation has no real roots");
        }
        if (delta==0){
            double x=(-1*b)/(2*a);
            System.out.println("has a coincident root x1=x2= " +x);
        }



        }

}
