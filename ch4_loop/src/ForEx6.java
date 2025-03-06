import java.util.Scanner;

public class ForEx6 {

    // 반복문 - for, while, do~while
    // 반복적으로 실행해야 하는 코드를 간단하게 처리

    public static void main(String[] args) {

//     팩토리얼 구하기
int sum = 0;

Scanner scanner = new Scanner(System.in);
         System.out.println("정수 입력");
         String input = scanner.nextLine();
         int num = Integer.parseInt(input);


         int fact =1;
for (int i = 1; i <= num; i++) {

    fact *= i;
}

System.out.println(num+"! ="+fact);
//  입력 받은 숫자의 팩토리얼 구하기 
//  4 

}
}
