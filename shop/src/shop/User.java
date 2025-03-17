package shop;

public class User {
    private String namne;
    private PayType payType;

    public User(String namne, PayType payType) {
        this.namne = namne;
        this.payType = payType;
    }

    public String getNamne() {
        return namne;
    }

    public PayType getPayType() {
        return payType;
    }

}
