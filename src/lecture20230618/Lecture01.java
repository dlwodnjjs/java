package lecture20230618;
import java.util.Scanner;
public class Lecture01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int n= scan.nextInt();
        System.out.println(str.charAt(n-1));
    }
}
