package poly;

public class Car2Ex {
    public static void main(String[] args) {
        Car2 car2 = new Car2();

        for (int i = 0; i < 5; i++) {
            int problemLocation = car2.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 교체");
                    car2.frontLeft = new HankookTire(15, "앞 왼쪽");
                    break;

                case 2:
                    System.out.println("앞 오른쪽 교체");
                    car2.frontRight = new KumhoTire(13, null);
                    break;

                case 3:
                    System.out.println("뒤 왼쪽 교체");
                    car2.backLeft = new HankookTire(5, " 뒤 왼쪽");
                    break;

                case 4:
                    System.out.println("뒤 오른쪽 교체");
                    car2.backRight = new HankookTire(13, "뒤 오른쪽");

                    break;

                default:
                    break;
            }
        }

    }

}
