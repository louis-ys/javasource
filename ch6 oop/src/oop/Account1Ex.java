package oop;

public class Account1Ex {

    public static void main(String[] args) {

        Account account = new Account("110-11", "한지민", 1100000);

        account.deposit(30000);
        System.out.println("현재 잔액 :" + account.getBalance());

        account.withdraw(70000);
        System.out.println("현재 잔액 :" + account.getBalance());

    }

}
