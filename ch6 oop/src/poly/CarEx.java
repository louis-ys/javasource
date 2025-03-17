package poly;

public class CarEx {
    public static void main(String[] args) {

        Car car = new FireEngine();

        car.drive();
        car.stop();

        FireEngine fe = (FireEngine) car;
        fe.Water();

        ((FireEngine) car).Water();

        // instanceof : 참조변수가 참조하고 있는 실제 인스턴스의 타입 알아보기

        if (car instanceof FireEngine) {
            System.out.println(" car - FireEngine의 instance 임");
        }
        if (car instanceof Car) {
            System.out.println("car - Car의 instance 임");
        }

        Car car2 = new Car();

        if (car2 instanceof FireEngine) {
            System.out.println(" car2 - FireEngine의 instance 임");
        }
        if (car2 instanceof Car) {
            System.out.println("car2 - Car의 instance 임");
        }

    }
}