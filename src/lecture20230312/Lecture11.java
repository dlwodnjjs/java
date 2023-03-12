package lecture20230312;
import java.util.Scanner;
public class Lecture11 {
    public static void printTest(String name, int math, int eng) {
        // 변수 생성
        String result = "";

        // 조건에 따른 값 변경
        if (math>=90 && eng>=90) {
            result = "전액 장학금!";
        } else if (math>=90 || eng>=90) {
            result = "반액 장학금!";
        } else {
            result = "다음 기회에~";
        }

        // 결과 출력
        System.out.println(name+" => "+result);
    }

    public static void main(String[] args) {
        printTest("Park", 100, 92);
        printTest("Kim", 82, 96);
        printTest("Choi", 82, 88);
    }
}
