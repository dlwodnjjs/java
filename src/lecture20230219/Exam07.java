package lecture20230219;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        System.out.print("점수입력: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println();
        if (number < 0 || number > 100) {
            System.out.println("입력오류!");
        }
        else {
            System.out.print("입력된값: ");
            System.out.println(number);
        }
    }
}