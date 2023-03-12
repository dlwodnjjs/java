package lecture20230312;
import java.util.Scanner;
public class Lecture09 {
    public static void buy(int age) {
        String result = "";
        if(age>=19) {
            result = "O";
        } else {
            result = "X"; /* 2. 적절한 값을 넣으세요. */
        }

        // 결과 출력
        System.out.println(age+"세 => 담배판매("+result+")");
    }

    public static void main(String[] args) {
        buy(15);
        buy(19);
        buy(22);
    }
}
