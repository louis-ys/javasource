package poly;

public class KumhoTire extends Tire {

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean roll() {

        if (accumulateRotation < maxRotation) {
            System.out.println(location + " KumhoTireTire 수명 :" + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + " KumhoTire 펑크 ***");
            return false;
        }

    }

}
