package algorithm;

import java.util.Scanner;

public class Factorial {  public static int Fact(int number)
{
    if (number >= 1)
        return number * Fact(number - 1);
    else
        return 1;
}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");

        int num = scanner.nextInt();

        System.out.printf("%x factorial of number  = %x \n", num, Fact(num));
        }
}

