package lecture20230312;
import java.util.Scanner;
public class Lecture1238490 {
    public static void bard(int a, int b){
        Scanner scant= new Scanner(System.in);
        String e= scant.nextLine();
        if(e.equals("+")){
            System.out.println(a+" + "+b+" = "+(a+b));
        }
        else if (e.equals("-")){
            System.out.println(a+" - "+b+" = "+(a-b));
        }
        else if (e.equals("*")){
            System.out.println(a+" * "+b+" = "+(a*b));
        }
        else if (e.equals("/")){
            System.out.println(a+" / "+b+" = "+(a/b));
        }
        else{
            System.out.println("빠큐");
        }

    }



    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int c= scan.nextInt();
        int d= scan.nextInt();
        String g= scan.nextLine();
        bard(c, d);

    }
}
