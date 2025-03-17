package extend;

public class BonusPointAc extends Account {

    private int bonusPoint;

    public BonusPointAc(String ano, String owner, long balance) {
        super(ano, owner, balance);
        // TODO Auto-generated constructor stub
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    // 보너스 포인트 = 보너스 포인트 + (예금액 * 1%)
    // 예금하다 메소드 수정
    @Override
    void deposit(long amount) {
        // TODO Auto-generated method stub
        super.deposit(amount);

        bonusPoint += amount * 0.01;

    }

}
