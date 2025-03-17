package shop;

import java.util.Scanner;

public class MyshopEx extends Product {
    public MyshopEx(String pname, int price) {
        super(pname, price);

    }

    public static void main(String[] args) {
        Ishop shop = new Myshop();
        // 상점 이름 지정

        Scanner sc = new Scanner(System.in);

        shop.setTitle("상점");

        shop.genuser();
        // 제품 생성
        shop.genProduct();

        shop.start();

    }

    @Override
    public void printExtra() {

    }

}
