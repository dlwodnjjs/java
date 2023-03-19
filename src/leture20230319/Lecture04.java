package leture20230319;
import java.util.Scanner;
import java.util.Random;
public class Lecture04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random= new Random();
        System.out.println("게임을 시작 하시겠습니까> 예)아니오)");
        String answer=scan.nextLine();
        if(answer.equals("예")){
            System.out.println("예, 매칭을 시작하겠습니다.");
            System.out.println("게임이 매칭되었습니다.");
            int value=random.nextInt(50);
            int ranvalue=value%5;
            switch (ranvalue){
                case 0:
                    System.out.println("페이커님의 포지션은 미드입니다.");
                    break;
                case 1:
                    System.out.println("페이커님의 포지션은 탑입니다.");
                    break;
                case 2:
                    System.out.println("페이커님의 포지션은 정글입니다.");
                    break;
                case 3:
                    System.out.println("페이커님의 포지션은 원딜입니다.");
                    break;
                case 4:
                    System.out.println("페이커님의 포지션은 서폿입니다.");
            }
        }
        else{

        }

    }
}
