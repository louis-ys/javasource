package oop;

public class GoodsStock {

    // 속성 : code, stockNum
    // 기능 : 재고 추가한다, 재고 감소한다.
    String code;
    int stockNum;

    // 생성자

    void addStock(int num) {
        this.stockNum -= num;
    }

    // public GoodsStock() {
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    void add2Stock(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
