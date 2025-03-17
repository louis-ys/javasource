package extend;

public class CheckingAccount extends Account {

    private String caroNo; // 은행계좌 + 체크카드

    // 비용 지불
    // 사용한 카드번호와 체크카드 번호가 일치하는지 확인
    // 잔액 > 사용액

    long pay(String cardNo, int amount) throws Exception {
        if (!this.caroNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("카드넘버 잔액을 확인해 주세요");

        }
        withdraw(amount);
        // 잔액 반환
        return getBalance();
    }
    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // // super();
    // }

    public String getCaroNo() {
        return caroNo;
    }

    public CheckingAccount(String ano, String owner, long balance, String caroNo) {
        super(ano, owner, balance);
        this.caroNo = caroNo;
    }

    public void setCaroNo(String caroNo) {
        this.caroNo = caroNo;
    }

    public long payTrafficCard(String string, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payTrafficCard'");
    }
}
