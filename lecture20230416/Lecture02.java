package lecture20230416;
import java.util.Scanner;
import java.util.Random;
public class Lecture02 {
    public static void main(String[] args) {
            Random random= new Random();
            Scanner scan=new Scanner(System.in);
            System.out.println("게임 시작");
            int p=0;
            for(int i=0;i<40;i++){
                int win=random.nextInt(2);
                if(win%2==0){
                    System.out.println("승");
                    p++;
            }
                else{
                    System.out.println("패");
                }


            }
            if(p>=1 && p<=3){
                System.out.print("아이언 ");
                switch (p){
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                    case 3:
                        System.out.println("2");
                        break;
                }
            }
            else if (p>=4 && p<=11){
                System.out.print("브론즈 ");
                switch (p){
                    case 4:
                    case 5:
                        System.out.println("4");
                        break;
                    case 6:
                    case 7:
                        System.out.println("3");
                        break;
                    case 8:
                    case 9:
                        System.out.println("2");
                        break;
                    case 10:
                    case 11:
                        System.out.println("1");
                        break;
                }

            }
            else if (p>=12 && p<=19){
                System.out.print("실 버");
                switch (p){
                    case 12:
                    case 13:
                        System.out.println("4");
                        break;
                    case 14:
                    case 15:
                        System.out.println("3");
                        break;
                    case 16:
                }
            }
    }
}
