package algorithm.Array;

import java.util.Scanner;

public class ArrayRandomNumber { public static void main(String[] args) {
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
}
}
                                                     /*  Console'dan bir sayı alınmalı.
                                                      Alınan sayı boyutunda dizi oluşturulmalı ve içersine random objesi ile sayılar eklenmeli.(Random class kullanımı incelenmeli.)
                                                      Oluşturulan dizi ekrana bastırılmalı.   */