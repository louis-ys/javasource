import java.util.Scanner;

public class DowhileEx2 {
    public static void main(String[] args) {

        // 문자 입력 받은 후 출력
        // q 입력시 반복문 종료

        String input = " ";

        do {
            Scanner scanner = new Scanner(System.in);

            if (input != "q") {
                System.out.println(input);
                System.out.println("종료를 원하면 q, Q입력");
                System.out.println(">> ");
                input = scanner.nextLine();

            }

        } while (input.equals("q"));

        System.out.println("프로그램 종료합니다.");

    }

}
