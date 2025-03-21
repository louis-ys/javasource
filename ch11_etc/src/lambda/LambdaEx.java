package lambda;

public class LambdaEx {
    public static void main(String[] args) {
        // lambda2 를 사용
        // 1. 구현클래스 작성 : class Lambdaimpl implements Lambda2{}
        // 2 익명구현객체
        // 3 람다식으로 사용
        Lambda2 obj = () -> System.out.println("함수적 인터페이스 사용");

        obj.method();

        // obj =()-> {
        // int i = 100;
         

        // }

        Lambda3 lambda3 = (a,b) -> a > b ? a : b;
        System.out.println("max" + lambda3.max(5, 3));
    }

}
