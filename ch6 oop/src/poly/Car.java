package poly;

public class Car {

    String color;
    int door;

    void drive() {
        System.out.println(" Drive, Brrrrr ~~~");
    }

    void stop() {
        System.out.println(" Stop !!!!");

    }
}

class FireEngine extends Car {
    void Water() {
        System.out.println("Water !!!!!");
    }

}
