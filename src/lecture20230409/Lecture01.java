package lecture20230409;
import java.util.Random;
import java.util.Scanner;
public class Lecture01 {
    public static void battle(){
        Scanner scan= new Scanner(System.in);
        System.out.println("페이커의 포지션은 미드이고 야쓰오를 선택했습니다.");
        System.out.println("페이커의 기본공격은 100입니다.");
        System.out.println("상대 캐릭터 탈론의 체력은 1000입니다.");
        String item=scan.nextLine();
        int atk=100;
        switch (item){
            case "도란링":
                System.out.println("도란링을 선택했습니다");
                atk+=1;
                break;
            case "도란검":
                System.out.println("도란검을 선택했습니다.");
                atk+=5;
                break;
            case "도란방패":
                System.out.println("도란방패를 선택했습니다.");
                atk-=10;
                break;
            case "신발":
                System.out.println("신발을 선택했습니다.");
                break;
        }
        int hp=1000;
        while (hp>0) {
            if (scan.nextInt() == 1) {
                System.out.print("공격을 시작합니다. 적에게 준 피해량 "+atk);
                if(hp-atk>0) {
                    System.out.println(", 탈론의 남은 체력 " + (hp -= atk)+".");
                }
                else if (hp-atk<=0){
                    System.out.println(", 탈론의 남은 체력 0. 탈론이 죽었습니다.");
                    System.out.println("승리");
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
       battle();
    }
}
