package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        // CheckingAccount의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨

        Scanner sc = new Scanner(System.in);

        CheckingAccount cAccount = new CheckingAccount("110-10", "홍", 100000, "123-331");

        System.out.println("계좌번호 : " + cAccount.getAno());
        System.out.println("계좌주 : " + cAccount.getOwner());
        System.out.println("잔액 : " + cAccount.getBalance());
        System.out.println("체크카드번호 : " + cAccount.getCaroNo());

        try {
            System.out.println("현재잔액 " + cAccount.pay("123-331", 100));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "홍", 10000, 300000);
        try {
            creditLineAccount.withdraw(310100);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        BonusPointAc bonusPointAc = new BonusPointAc("110-11", "홍", 1000000);

        System.out.println("보너스 포인트 : " + bonusPointAc.getBonusPoint());

        CheckingAccount checkingAccount = new CheckingAccount("110-11", "홍", 10000, "123-1232");
        try {
            System.out.println("현재 잔액 :" + checkingAccount.payTrafficCard("123-1232", 1750));
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(" 사용후 잔액 : ");
    }

}
