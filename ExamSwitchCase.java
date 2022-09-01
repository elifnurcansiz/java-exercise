package examswitchcase;

import java.util.Scanner;

public class ExamSwitchCase {
    public static void main(String[] args) {
        int grade = 0;
        int result = 0;
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();

        if (grade > 90)
            result = 8;
        else if (grade >= 85 && grade <= 89)
            result = 7;
        else if (grade >= 70 && grade <= 74)
            result = 6;
        else if (grade >= 65 && grade <= 69)
            result = 5;
        else if (grade >= 60 && grade <= 64)
            result = 4;

        else if (grade >= 55 && grade <= 59)
            result = 3;
        else if (grade >= 50 && grade <= 54)
            result = 2;
        else if (grade < 50)
            result =1;

        switch (result) {
            case 1:
                System.out.println("Grade: FF");
                break;
            case 2:
                System.out.println("Grade: DD");
                break;
            case 3:
                System.out.println("Grade: DC");
                break;
            case 4:
                System.out.println("Grade: CC");
                break;
            case 5:
                System.out.println("Grade: CB");
                break;
            case 6:
                System.out.println("Grade: BB");
                break;
            case 7:
                System.out.println("Grade: BA");
                break;
            case 8:
                System.out.println("Grade: AA");
                break;


        }
    }
}