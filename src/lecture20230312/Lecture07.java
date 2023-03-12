package lecture20230312;
import java.util.Scanner;
public class Lecture07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a=scan.nextDouble();
        double pi=Math.PI;
        double b=a * a * pi;
        System.out.print("반지름이 "+a);
        System.out.printf("인 원의 넓이 =>  %.3f",b);
    }
}
