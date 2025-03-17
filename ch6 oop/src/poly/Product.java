package poly;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }

}

class Tv extends Product {

    public Tv() {
        super(1000);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tv";
    }

}

class Computer extends Product {

    public Computer() {
        super(2000);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Computer";
    }
}

class Audio extends Product {

    public Audio() {
        super(500);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Audio";
    }

}
