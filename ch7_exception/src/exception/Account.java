package exception;

public class Account {

    // 속성 : 계좌번호(ano), 계좌명(owner), 잔액(balance)
    // 110-10-0100 long
    // 기능 : 예금하다, 출금하다
    // deposit, withdraw

    private String ano;
    private String owner;
    private long balance;

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

    // public Account() {
    // }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;

    }

    void withdraw(long amount) throws Exception {
        if (amount > balance)
            throw new Exception("잔액확인");
        return;

        // 인출액이 잔액보다 큰지 작은지 확인

    }

}
