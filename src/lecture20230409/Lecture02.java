package lecture20230409;
import java.util.Scanner;
import java.util.Random;
public class Lecture02 {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("대결을 시작합니까?");
        int khp=700;
        int zhp=1000;
        int katk=120;
        int zatk=150;
        if(scan.nextInt()==1){

                while(khp>0 && zhp>0){
                    try{
                        System.out.println("미니언이 생성되었습니다.");
                        int ranRan= ran.nextInt(100);
                        System.out.println("코르키 -> 제드 "+(katk-ranRan)+"의 피해 (코르키체력: "+khp+", 제드체력: "+(zhp-=(katk-ranRan))+")");
                        ranRan=ran.nextInt(100);
                        System.out.println("제드 -> 코르키 "+(zatk-ranRan)+"의 피해 (코르키체력: "+(khp-=(zatk-ranRan))+", 제드체력: "+zhp);
                        if(khp<=0 || zhp<=0){
                            if(khp<=0){
                                System.out.println("제드 라인전 승리");
                            }
                            else if(zhp<=0){
                                System.out.println("코르키 라인전 승리");
                            }
                        }
                        Thread.sleep(2000);

                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

        }
        else{

        }

    }
}
