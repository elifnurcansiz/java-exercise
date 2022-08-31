package examscorecalculation;

import java.util.Objects;
import java.util.Scanner;

public class ExamScoreCalculation {
    private  final   static String  mesagetemplate="harf notu: %s başarı durumu: %s ";

    public static void main(String[] args) {

        int midtermExam;
        int finalExam;
        double average;

        Scanner r = new Scanner(System.in);
        char next;
       try {
           do{


               System.out.println("Enter your midtermExam.");
               midtermExam = r.nextInt();

               System.out.println("Enter your finalExam");
               finalExam = r.nextInt();



               average = (finalExam * 0.6) + midtermExam * 0.4;



               if (average <= 100 && average >= 90) {
                   System.out.println(String.format(mesagetemplate,"AA","Başarılı"));

               }
               else if (average <= 89 && average >= 85) {
                   System.out.println(String.format(mesagetemplate,"BA","Başarılı"));

               }
               else if (average <= 74 && average >= 70) {
                   System.out.println(String.format(mesagetemplate,"BB","Başarılı"));
               }
               else if (average <= 69 && average >= 65) {
                   System.out.println(String.format(mesagetemplate,"CB","Başarılı"));
               }
               else if (average <= 64 && average >= 60) {
                   System.out.println(String.format(mesagetemplate,"CC","Başarılı"));
               }
               else if (average <= 59 && average >= 55) {
                   System.out.println(String.format(mesagetemplate,"DC","Başarılı"));
               }
               else if (average <= 54 && average >= 50) {
                   System.out.println("DD");
               }
               else if (average < 50) {
                   System.out.println("Başarısız00");
               }
               System.out.println("Do you want to continue?(E-H)");
               next = r.next().charAt(0);
           }while(next=='e'||next=='E');
       }catch (Exception e){
        System.out.println("You can only enter numbers !!!");}
    }

}
