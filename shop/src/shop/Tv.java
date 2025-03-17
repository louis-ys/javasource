package shop;

public class Tv extends Product {

    private String resoluString;

    public Tv(String pname, int price, String H) {

        super(pname, price);
        this.H = H;
    }

    private String H;

    @Override
    public void printExtra() {
        System.out.println(" 해상도 : " + this.H);
    }

}
