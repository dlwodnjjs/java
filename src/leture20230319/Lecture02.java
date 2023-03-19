package leture20230319;
import java.util.Scanner;
public class Lecture02 {
    public static void main(String[] args) {
        int a=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                a=a+i;
            }
        }
            System.out.print(a);
    }
}
