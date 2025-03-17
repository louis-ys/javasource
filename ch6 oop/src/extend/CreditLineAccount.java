package extend;

public class CreditLineAccount extends Account {
    private int creditLine; // 마이너스한도

    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
        // TODO Auto-generated constructor stub
    }

    // CreditLineAccount(){
    // super()
    // }

    // 오버라이딩
    // 잔액 + 마이너스 한도 - 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도 범위를 초과합니다");

        }

        // TODO Auto-generated method stub
        super.setBalance(super.getBalance() - amount);
    }
}
