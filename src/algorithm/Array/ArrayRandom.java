package algorithm.Array;
import java.util.Scanner;
import java.lang.Math;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1 ");
        int arraylength1 = scanner.nextInt();
        int [] array = new int[arraylength1];
        System.out.println("Enter a number2 ");
        int arraylength2 = scanner.nextInt();
        int [] array2 = new int[arraylength2];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 5;
        }

        for (int i = 0; i < array.length; i++) {
            array2[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+
                    array[i]
            );
        }

        System.out.println("\nArray2");
        array2 = array.clone();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+
                    array2[i]
            );
        }

        int [] array3 = new int[arraylength1 + arraylength2];


        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for (int i = array3.length -1; i < ( array3.length + array2.length); i++) {
            array3[i] = array2[i];
        }

        System.out.println("\nArray3");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+
                    array3[i]
            );
        }
    }
}
/*Console'dan iki sayı alınmalı.
     Alınan sayıların boyutunda 2 dizi oluşturulmalı ve içersine random objesi ile sayılar eklenmeli.
     Yeni boş bir dizi oluşturulmalı ve önceki adımda oluşturulan iki dizi elamanlarının hepsi bu diziye eklenmeli
     Oluşturulan 3 dizi ekrana bastırılmalı.

*/