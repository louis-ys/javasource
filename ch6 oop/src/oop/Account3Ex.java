package oop;

import java.util.Scanner;

public class Account3Ex {

    // private Account account;
    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Account2Ex obj = new Account2Ex();

        boolean run = true;
        while (run) {
            System.out.println("=====================================================");
            System.out.println("1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 5. 종료");
            System.out.println("=====================================================");

            System.out.println("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccont();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("번호 확인");
                    break;

            }

        }

    }

    private static void createAccont() {
        System.out.println("계좌번호 : ");
        String ano = sc.nextLine();

        System.out.println("계좌주 : ");
        String owner = sc.nextLine();

        System.out.println("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < account.length; j++) {
            if (account[j] == null) {
                account[j] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }

        }
    }

    private static void accountList() {
        System.out.println("----------------------------");
        System.out.println("계좌 목록");
        System.out.println("----------------------------");
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null)
        // System.out.printf("%s\t%s\t%d\n", account);{

        // }
        // System.out.printf("%s\t %s\t %d\n");
        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());

            }

        }
    }

    private static void deposit() {
        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account 의 계좌번호 일치 여부 확인
        System.out.println("계좌번호 : ");
        String ano = sc.nextLine();
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && ano.equals(account[i].getAno())) {
                System.out.print("예금액 : ");
                int balance = Integer.parseInt(sc.nextLine());
                account[i].deposit(balance);
            }

        }
    }

    private static void withdraw() {
        System.out.println("계좌번호 : ");
        String ano = sc.nextLine();
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && account[i].getAno().equals(ano)) {
                System.out.print("출금액 : ");
                int balance = Integer.parseInt(sc.nextLine());
                account[i].withdraw(balance);

            }
        }
    }

    private static Account findAccount() {

        System.out.println("계좌번호 : ");
        String ano = sc.nextLine();
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && account[i].getAno().equals(ano)) {
                return account[i];
            }

        }
        return null;
        // }
    }
}
