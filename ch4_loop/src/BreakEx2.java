import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        // 주사위 눈이 6이 나올때 까지

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        // int mony = 0;
        int balance = 0;

        while (run) {

            System.out.println("===========================================");
            System.out.println(" 1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료  ");
            System.out.println("===========================================");

            System.out.println("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 예금액 입력
                    // 잔액 +예금액
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("입금하실 금액 입력");
                    // mony = sc.nextInt();
                    // balance += mony;
                    balance += sc.nextInt();
                    break;

                case 2:
                    System.out.println("출금액 >> ");
                    // mony = sc.nextInt();
                    // balance -= mony;
                    balance -= sc.nextInt();
                    break;

                case 3:
                    System.out.println("잔액 : " + balance);

                    break;

                case 4:
                    run = false; // 반복문 종료
                    break;
                default:
                    break;
            }

        }

    }
}
