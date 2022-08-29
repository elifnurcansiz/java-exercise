package examscorecalculation;

import java.util.Scanner;

public class ExamScoreCalculation {
    public static void main(String[] args) {

        int midtermExam;
        int finalExam;
        double average;
        Scanner r = new Scanner(System.in);

        System.out.println("Enter your midtermExam.");
        midtermExam = r.nextInt();

        System.out.println("Enter your finalExam");
        finalExam = r.nextInt();


        average = (finalExam * 0.6) + midtermExam * 0.4;

        if (average >= 50 && average <= 100) {
            System.out.println("You passed this lesson");
        } else {
            System.out.println("You failed this lesson ");
            System.out.println("FF");
        }

        if (average <= 100 && average >= 90) {
            System.out.println("AA");
        }
        if (average <= 89 && average >= 85) {
            System.out.println("BA");

        }
        if (average <= 74 && average >= 70) {
            System.out.println("BB");
        }
        if (average <= 69 && average >= 65) {
            System.out.println("CB");
        }
        if (average <= 64 && average >= 60) {
            System.out.println("CC");
        }
        if (average <= 59 && average >= 55) {
            System.out.println("DC");
        }
        if (average <= 54 && average >= 50) {
            System.out.println("DD");
        }
        if (average < 50) {
            System.out.println("FF");
        }


    }
}
