// 메서드 종류
// 1. 인스턴스 메서드
// 2. 클래스 메서드

// r같은 클래스 내에서 다른 메소드 호출 가능 
//  static - non-static : 생성되는 시기가 다르기 때문에 호출 시점을 따져야함

public class MinCalc {

    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // plus, avg,execute,println 호출 불가 => 호출하려면 new MiniCalc() 한 후
    }

    int plus(int x, int y) {

        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println(" 실행 결과 :" + result);

    }

    void println(String msg) {
        System.out.println(msg);
    }

}
