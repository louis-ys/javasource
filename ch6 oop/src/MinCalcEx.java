// 메서드 종류
// 1. 인스턴스 메서드
// 2. 클래스 메서드

// r같은 클래스 내에서 다른 메소드 호출 가능 
//  이름

public class MinCalcEx {
    public static void main(String[] args) {

        // 클래스 메서드 이기 때문에 객체 생성없이 클래스이름. 으로 호출 가능
        MinCalc.print();
        System.out.println(MinCalc.k);

        MinCalc calc = new MinCalc();
        calc.execute();

        calc.a = 7;
        calc.b = 9;

    }

}
