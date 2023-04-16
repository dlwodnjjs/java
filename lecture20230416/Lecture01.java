package lecture20230416;
import java.util.Random;
import java.util.Scanner;
public class Lecture01 {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("대결을 시작합니까?");
        int khp=1000;
        int thp=700;
        int katk=120;
        int tatk=150;
        if(scan.nextInt()==1){
            try{
                System.out.println("미니언이 생성되었습니다.");
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            int lf=0;
            while(khp>0 && thp>0){
                try{
                    int Rank= ran.nextInt(90);
                    int Ranr=ran.nextInt(40);
                    int Ranm=ran.nextInt(100);
                    int result1= thp-(katk-Rank);
                    lf++;
                    if(result1<=0){
                        result1=0;
                    }
                    thp=result1;
                    System.out.println("카시오페아 -> 탈론 "+(katk-Rank)+"의 피해 (카시오페아체력: "+khp+", 탈론체력: "+result1+")");
                    int result2=khp-(tatk-Rank);
                    if(result2<=0){
                        result2=0;
                    }
                    khp=result2;
                    int Rant=ran.nextInt(120);
                    System.out.println("탈론 -> 카시오페아 "+(tatk-Rant)+"의 피해 (카시오페아체력: "+result2+", 탑론체력: "+thp+")");
                    if(lf%3==0){
                        result1= thp-(40-Ranr);
                        if(result1<=0){
                            result1=0;
                        }
                        thp=result1;
                        System.out.println("람머스 -> 탈론 "+(40-Ranr)+"의 피해 (탈론체력: "+result1+")");
                        result2=khp-(100-Ranm);
                        if(result2<=0){
                            result2=0;
                        }
                        khp=result2;
                        System.out.println("마스터이 -> 카시오페아 "+(100-Ranm)+"의 피해 (카시오페아체력: "+result2+")");
                    }
                    if(khp<=0 || thp<=0){
                        if(khp<=0){
                            System.out.println("탈론 라인전 승리");
                        }
                        else if(thp<=0){
                            System.out.println("카시오페아 라인전 승리");
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
