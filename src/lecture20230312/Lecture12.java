package lecture20230312;
import java.util.Scanner;
public class Lecture12 {
    public static void test(double height, boolean isMale) {
        // 변수 생성
        String gender = "";
        String result = "";

        // 조건 처리
        if (isMale) {
            gender = "남";
            if (height>=173.5) {
                result = "이상";
            } else {
                result = "이하";
            }
        } else {
            gender = "여";
            if (height>=160.8) {
                result = "이상";
            } else {
                result = "이하";
            }
        }

        // 결과 출력
        System.out.printf("%.1fcm, %s => 평균키 %s\n", height, gender, result);
    }

    public static void main(String[] args) {
        test(176.3, true);
        test(162.7, false);
        test(171.8, true);
        test(158.4, false);
    }
}
