package extend;

public class CheckingTrafficAccount extends CheckingAccount {
    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String caroNo) {
        super(ano, owner, balance, caroNo);
        // TODO Auto-generated constructor stub

        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // 교통비 지불
    long payTafficCard(String cardNo, int amount) throws Exception {
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다");
        }

        // long balance = pay(cardNo, amount);
        // return balance;

        return pay(cardNo, amount);
        // 교통카드기능이 있다면 교통비 지불

    }

}
