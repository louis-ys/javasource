package poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire frontLeft = new HankookTire(1, " 앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, " 앞 오른쪽");
        HankookTire backLeft = new HankookTire(1, " 뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, " 뒤 오른쪽");
        Car3 car3 = new Car3(frontLeft, frontRight, backLeft, backRight);

        System.out.println(car3.frontLeft);
        // NullPointerException
        System.out.println(car3.frontLeft.accumulateRotation);

    }
}
