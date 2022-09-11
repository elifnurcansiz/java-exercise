package printnumberinreserve;
import java.util.Scanner;
public class PrintNumberReserve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        System.out.print(" Reverse the number you entered = ");
        while(number > 0) {

            System.out.print(number  % 10);
            number /= 10;
        }
    }
}
