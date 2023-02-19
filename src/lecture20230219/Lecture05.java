package lecture20230219;

public class Lecture05 {
        public static void main(String[] args) {
            int[] numberArr = new int[3]; //정수형 배열
            String[] strArr={"hi", "good", "grean", "blue"}; //문자형 배열 strArr 선언후 값 초기화
            for(int j=0;j< strArr.length;j++){
                System.out.printf(strArr[j]);
            }
            for(int i=0;i<numberArr.length;i++){
                System.out.println(numberArr[i]);
            }
        }

}


