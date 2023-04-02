package lecture20230402;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Lecture01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList();
        Scanner scan=new Scanner(System.in);
        Random random= new Random();
        System.out.print("파티원의 수를 정해주세요: ");
        int party=scan.nextInt();
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
        System.out.println(gammode+"을(를) 선택했습니다.\n"+gammode+"을(를) 매칭하겠습니다.");
        System.out.println("게임이 매칭되었습니다.");
        int value=random.nextInt(5);
        int ranValue=value%5;
        int ranValue2=value%2;
        switch (ranValue2){
            case 0:
                System.out.println("팀 진영은 블루팀입니다.");
                break;

            case 1:
                System.out.println("팀 진영은 레드팀입니다.");
        }
        switch (ranValue){
            case 0:
                System.out.println("페이커님의 포지션은 미드입니다. ");
                break;

            case 1:
                System.out.println("페이커님의 포지션은 탑입니다. ");
                break;
            case 2:
                System.out.println("페이커님의 포지션은 정글입니다. ");
                break;
            case 3:
                System.out.println("페이커님의 포지션은 원딜입니다. ");
                break;
            case 4:
                System.out.println("페이커님의 포지션은 서폿입니다. ");
                break;
        }
        int k=55134;
        if(party!=1){
            for(int i=1;i<party;i++){
                System.out.print("파티원"+i+"의 포지션은 ");
                int value1=random.nextInt(50);
                while(value1%5==ranValue||arr.contains(value1%5)){
                    value1=random.nextInt(50);

                }
                int ranValue3=value1%5;
                arr.add(ranValue3);

                switch (ranValue3){
                    case 0:
                        System.out.println("미드입니다. ");
                        break;

                    case 1:
                        System.out.println("탑입니다. ");
                        break;
                    case 2:
                        System.out.println("정글입니다. ");
                        break;
                    case 3:
                        System.out.println("원딜입니다. ");
                        break;
                    case 4:
                        System.out.println("서폿입니다. ");
                        break;
                }


            }
            if(party<5){
                for(int i=1;i<6-party;i++){
                System.out.print("외부인"+i+"의 포지션은 ");
                int value1=random.nextInt(50);
                while (value1%5==ranValue||arr.contains(value1%5)){
                    value1=random.nextInt(50);

                }
                    int ranValue3=value1%5;
                    arr.add(ranValue3);

                switch (ranValue3){
                    case 0:
                        System.out.println("미드입니다. ");
                        break;

                   case 1:
                        System.out.println("탑입니다. ");
                        break;
                    case 2:
                        System.out.println("정글입니다. ");
                        break;
                    case 3:
                        System.out.println("원딜입니다. ");
                        break;
                    case 4:
                        System.out.println("서폿입니다. ");
                        break;
                }


            }

            }

        }




    }
}
