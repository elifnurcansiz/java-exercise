package algorithm.Array;

import java.util.Scanner;
import java.lang.Math;
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int value = scanner.nextInt();
        int [] array = new int[value];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 5;
        }
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+
                    array[i]
            );
        }

        int [] array2 = new int[value];

        for (int i = 0; i < array.length; i++) {
                    array2[i] = array[i];
        }

        System.out.println("\nArray2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+
                    array2[i]
            );
        }
                                                         /*    Alınan sayı boyutunda dizi oluşturulmalı ve içersine random objesi ile sayılar eklenmeli.
                                                               Yeni boş bir dizi oluşturulmalı ve önceki adımda oluşturulan dizi bu diziye koplayalanmalı.
                                                                Oluşturulan 2 dizi ekrana bastırılmalı. */
    }
}
