package shop;

import java.util.Scanner;

public class Myshop2 implements Ishop {

    private String selUser;

    private String title;

    // 고객 5명 저장 가능한 배열 생성

    private User[] users = new User[5];
    // 제품 10 개 저장 가능한 배열 생성
    Product[] products = new Product[10];
    Product[] cart = new Product[10];

    Scanner sc = new Scanner(System.in);

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public void genuser() {

        users[0] = new User("간디", PayType.CARD);
        users[1] = new User("순신", PayType.CASH);

    }

    @Override
    public void genProduct() {
        products[0] = new Tv("삼성", 500000, "4k");
        products[1] = new Tv("엘지", 350000, "8K");
        products[2] = new Phone("초콜릿", 300000, "Skt");
        products[3] = new Phone("애플", 1500000, "kt");
        products[4] = new Phone("바나나", 100000, "kt");
    }

    @Override
    public void start() {
        System.out.println(title + " : 메인 화면 - 계정선택");
        System.out.println("========================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s(%s)\n", i++, user.getNamne(), user.getPayType());
            }

        }
        System.out.println("[x] 종료");
        System.out.println("========================");
        System.out.print("선택 :");
        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);

                break;

            case "1":
            case "0":
                selUser = input;
                // 사용자가 선택한 user 정보 담기 (checkout() 메소드 필요)
                productsList();
                break;

            default:
                System.out.println("입력을 확인해 주세요");
                start();

                break;
        }

    }

    public void productsList() {

        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("========================");
        int j = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", j++);
                product.printDetail();
            }
        }

        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("========================");
        System.out.print("선택 :");

        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":

                for (int i = 0; i < cart.length; i++) {

                    if (cart[i] == null) {
                        cart[i] = products[Integer.parseInt(input)];
                        break;
                    }
                }

                productsList();
                break;

            case "h":
                start();
                break;
            case "c":
                checkout();
                start();
                break;
            default:
                break;
        }
    }

    public void checkout() {
        System.out.println(title + " : " + users[Integer.parseInt(selUser)].getNamne() + "- 체크아웃");
        System.out.println("=============================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s  (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }

        }
        System.out.println("결제방법 : " + users[Integer.parseInt(selUser)].getPayType());
        System.out.println("합계 :" + sum);
        System.out.println("=============================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.println("선택 : ");

        String input = sc.nextLine();

        switch (input) {
            case "p":
                productsList();
                break;

            default:
                System.exit(sum);
                break;
        }

    }
}