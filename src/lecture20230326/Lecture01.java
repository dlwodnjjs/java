package lecture20230326;
import java.util.Random;
import java.util.Scanner;
public class Lecture01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random= new Random();
        System.out.println("게임을 선택해 주세요.\n"+"1.일반게임\n"+"2.랭크게임\n"+"3.우르프\n"+"4.단일챔피언\n"+"5.AI");
        int game=scan.nextInt();
        String gammode = null;
        switch (game){
            case 1:
                gammode="일반게임";
                break;
            case 2:
                gammode="랭크게임";
                break;
            case 3:
                gammode="우르프";
                break;
            case 4:
                gammode="단일챔피언";
                break;
            case 5:
                gammode="AI";
        }
        System.out.println(gammode+"을(를) 선택했습니다."+gammode+"을(를) 매칭하겠습니다.");
            System.out.println("게임이 매칭되었습니다.");
            int value=random.nextInt(50);
            int ranvalue=value%5;
            int ranvalue2=value%2;
            switch (ranvalue){
                case 0:
                    System.out.print("페이커님의 포지션은 미드이고 ");
                    break;
                case 1:
                    System.out.print("페이커님의 포지션은 탑이고 ");
                    break;
                case 2:
                    System.out.print("페이커님의 포지션은 정글이고 ");
                    break;
                case 3:
                    System.out.print("페이커님의 포지션은 원딜이고 ");
                    break;
                case 4:
                    System.out.print("페이커님의 포지션은 서폿이고 ");
                    break;
            }
            switch (ranvalue2){
                case 0:
                    System.out.println("블루팀입니다.");
                    break;

                    case 1:
                    System.out.println("레드팀입니다.");
        }

    }
}
