package leture20230319;
import java.util.Scanner;
public class Lecture03 {
    public static void main(String[] args) {
        /*for(int i=0;i<=23;i++){
            for (int j=0;j<60;j++){
                System.out.println(i+"시 "+j+"분");
            }
            }*/
        int i=0;
        int j=0;
        while(i<=23){
            while(j<=59){
                System.out.println(i+"시"+j+"분");
                j++;
            }
            i++;
        }
        }
    }

