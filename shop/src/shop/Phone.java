package shop;

public class Phone extends Product {

    public Phone(String pname, int price, String C) {

        super(pname, price);
        this.C = C;
    }

    private String C; // 통신사

    @Override
    public void printExtra() {
        System.out.println(" 통신사 " + this.C);
    }

}
