package lecture20230618;
import java.util.Scanner;
public class Lecture02 {
    public static String makeStrReverse(String msg){
        int b=msg.length();
        char[] rMsg= new char[msg.length()];
        for(int i=b-1;i>=0;i--){
            char c=msg.charAt(i);
            rMsg[b-i-1]=c;
        }

        String reverseMsg=String.valueOf(rMsg);
        return reverseMsg;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        System.out.println(makeStrReverse(a));
    }
}
