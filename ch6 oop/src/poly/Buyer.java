package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    Product[] products = new Product[10];

    // products 배열에 사용할 인덱스
    int i = 0;

    // 매개변수의 다형성

    // void buy(Product product) {
    // // 물건구매
    // // 잔액 = 잔액 - 상품가격
    // if (money < product.price) {
    // System.out.println("잔액 부족입니다.");
    // return;

    // }

    // this.money -= product.price;
    // // 보너스포인트 계산
    // bonusPoint += product.bonusPoint;
    // System.out.println(product + "을/를 구매하셨습니다.");
    // }
    void buy(Product product) {
        // 물건구매
        // // 잔액 = 잔액 - 상품가격
        if (money < product.price) {
            System.out.println("잔액 부족입니다.");
            return;

        }

        this.money -= product.price;
        // 보너스포인트 계산
        bonusPoint += product.bonusPoint;
        // 구매한 물건을 products 배열 추가

        products[i++] = product;

        System.out.println(product + "을/를 구매하셨습니다.");
    }
    // 상속관계가 없을 때
    // void buy(Computer[] computers) {

    // }
    // void buy(Tv[] computers) {

    // }
    // void buy(Audio[] computers) {
    void summary() {
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < products.length; i++) {

            if (products[i] == null) {

                break;
            }
            sum += products[i].price;
            itemList += products[i] + " ";

        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만 원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");

    }

}
