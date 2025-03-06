package condition;

import java.util.Scanner;

public class Iftest7 {
    public static void main(String[] args) {
        //  num1 이라는 변수 선언 후 임의의 값 담기 

        // num1 이 짝수, 홀수 인지 출력하기

        // int num1 = 98;
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("두자리 정수 입력");
         String input = scanner.nextLine();
         int num = Integer.parseInt(input);

        if (1 == num %2) {
        System.out.println("홀수 입니다.");
        }else{
        System.out.println("짝수 입니다.");
        }
    }
}
