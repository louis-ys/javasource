package oop;

public class GoodsStock2Ex {

    public static void main(String[] args) {

        // GoodsStock goodsStock = new GoodsStock();
        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;

        System.out.println(goodsStock);

        // 판매
        goodsStock.addStock(5);
        System.out.println(goodsStock);

        // 입고

        goodsStock.add2Stock(5);
        System.out.println(goodsStock);
    }

}
