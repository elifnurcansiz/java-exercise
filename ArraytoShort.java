package algorithm.Array;

import java.util.Scanner;

public class ArraytoShort {
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gecici;
        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Array " + (i+1) + ". Enter the element: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Array sorted from smallest to largest:\n");
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Array " + (i+1) + ". element : " + dizi[i]);
}}}
/*    Console'dan bir sayı alınmalı.
     Alınan sayı boyutunda dizi oluşturulmalı ve içersine random objesi ile sayılar eklenmeli.
     Oluşturulan dizi küçükten büyüğe sıralanmalı.(Sıralama kısmı kendi methodların ile yapmalısın..)
     Sonuç ekrana bastırılmalı.
        */