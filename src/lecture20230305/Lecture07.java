package lecture20230305;
import java.util.Scanner;
public class Lecture07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double F= scan.nextDouble();
        double C=(F-32)/1.8;
        System.out.println("화씨 "+F+"도는 섭씨로 "+C+"도입니다!");
    }
}
