package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {
      SieveofEratosthenes soe =new SieveofEratosthenes();
        System.out.println("please enter a positive integer");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        soe.countNumberOfPrimesUpTo(n);
    }
    void countNumberOfPrimesUpTo(int n){
        long start =System.currentTimeMillis();
boolean[] list=new boolean[n+1];
        Arrays.fill(list,true);

        for(int i=2; i<=n; i++) {
            if (list[i]==true)
            for(int j=2; j*i<=n; j++) //n e kadar olanları bulacağım için nin katlarını işaretlemem anlamlı
            list[i*j]=false;
        }
        long end= System.currentTimeMillis();
        long time=end-start;
        int numberOfprimes=0;
        for(boolean b:list){
            if(b)
                numberOfprimes++;
        }
        System.out.println(n +"sayısına kadar "+(numberOfprimes-2) +"tane asal sayı vardır ");
        System.out.println("time :"+time+"ms.");
    }
}
