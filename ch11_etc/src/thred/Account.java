package thred;

public class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    private void Withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            balance -= money;
        }

    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }

        }
    }

}
