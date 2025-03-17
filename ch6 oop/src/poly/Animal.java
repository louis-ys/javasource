package poly;

public class Animal {
    Animal() {

        System.out.println("Animal 생성자");
    }

    class Canine extends Animal {
        Canine() {
            System.out.println("canine 생성자");
        }
    }

    class Feline extends Animal {
        Feline() {

            System.out.println("feline 생성자");
        }
    }

    class Dog extends Animal {
        Dog() {
            System.out.println("Dog 생성자");
        }
    }

    class Cat extends Animal {
        Cat() {
            System.out.println("Cat 생성자");
        }
    }

}
