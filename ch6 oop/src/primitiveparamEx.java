public class primitiveparamEx {

    // static 메서드 : 클래스 메서드
    public static void main(String[] args) {
        // main 메서드

        primitiveparamEx obj = new primitiveparamEx();

        Data d = new Data();
        d.x = 100;
        System.out.println("Before change() : x = " + d.x);
        change(d.x);
        System.out.println("change() : x = " + d.x);
        change2(d);
        System.out.print("After change() = ");
        System.out.println(d.x);

    }

    static void change(int x) { // 100
        x = 10000;

        System.out.println("inchange() : x = " + x);
    }

    static void change2(Data d) { // d
        d.x = 10000;
        System.out.println("change() : d.x = " + d.x);
    }

}
