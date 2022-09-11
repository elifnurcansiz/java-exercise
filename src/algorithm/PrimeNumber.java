package algorithm;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("please enter a positive integer");
        Scanner scanner = new Scanner(System.in );
       int n =scanner.nextInt();
        System.out.println(primeNumber.isPrime(n));


    }
    boolean isPrime(int n ) {
        boolean prime = true;
        int i=2;
        int upperBound= (int)Math.sqrt(n) +1 ; //daha fazla cpu harcamadan kareköküne kadar bölüyoruz
        for (; i<upperBound; i++) {
            if (n%i==0){
                prime = false;
                break;
            }

        }
        if (!prime)
            System.out.println("first divisor: " +i );
        return prime ;
    }

}


