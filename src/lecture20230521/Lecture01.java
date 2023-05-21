package lecture20230521;
import java.util.Scanner;
import java.util.Random;
public class Lecture01 {
    public static int calculate(int a) {
        Scanner scan = new Scanner(System.in);
        String e = scan.nextLine();
        int b = scan.nextInt();
        if (e.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (e.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (e.equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (e.equals("/")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("빠큐");
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        calculate(a);


    }
}
