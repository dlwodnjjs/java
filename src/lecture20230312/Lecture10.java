package lecture20230312;
import java.util.Scanner;
public class Lecture10 {
    public static void printRole(int age) {
        // 변수 생성
        String role = "";

        // 조건별 결과 선택
        if (age>=18) {
            role = "성인";
        } else if (age>=13 || age<18) {
            role = "청소년";
        } else if (age>=6 || age<13){
            role = "어린이";
        } else {
            role = "유아";
        }

        // 결과 출력
        System.out.println(age+"살 => "+role+"입니다.");
    }

    public static void main(String[] args) {
        printRole(22); // 22살 => 성인
        printRole(16); // 16살 => 청소년
        printRole(10); // 10살 => 어린이
        printRole(4); // 4살 => 유아
    }
}
