package oop;

import java.util.Scanner;

public class CalcEx {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // return 타입이 있다면 (void 제외)
        // 1) 변수에 담기
        // 2) 출력문 사용

        long result = calc.add(45, 15);
        System.out.println("resit =" + result);

        System.out.println(calc.add(45, 15));
        int num1 = 45, num2 = 15;
        long result2 = calc.add(num1, num2);
        System.out.printf("%d+%d = %d\n", num1, num2, calc.add(num1, num2));
        System.out.printf("%d-%d = %d\n", num1, num2, calc.subtract(num1, num2));
        System.out.printf("%d*%d = %d\n", num1, num2, calc.multiply(num1, num2));
        System.out.printf("%d /%d = %2f\n", num1, num2, calc.divide(num1, num2));

        // long 타입의 입력 값 2개
        // 출력 : 큰 숫자

    }
}
