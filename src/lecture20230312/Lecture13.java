package lecture20230312;
import java.time.Year;
import java.util.Scanner;
public class Lecture13 {
    public static void yean(int year){
        if(year%4==0){
            if(year%100!=0 || year%1000==0){
                System.out.println(year+"년은 윤년입니까? true");
            }
            else{
                System.out.println(year+"년은 윤년입니까? false");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        yean(a);
    }
}
