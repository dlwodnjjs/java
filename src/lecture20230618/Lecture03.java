package lecture20230618;
import java.util.Scanner;
public class Lecture03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            a=scan.nextInt();
            b+=a;
        }
        System.out.println(b);
    }
}
