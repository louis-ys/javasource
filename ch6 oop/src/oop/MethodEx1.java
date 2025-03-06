package oop;

import java.lang.reflect.Array;
import java.util.Arrays;

// 메소드 : 리턴타입 메소드명(){}
// 리턴(반환) 타입 : 기본타입(정수형,불린형,문자형,실수형), 객체(대문자로 시작), 배열 , void(리턴타입 없음) 
public class MethodEx1 {
    public static void main(String[] args) {

        // Method 인스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(15, 25);
        System.out.println("result =" + result);

        float result2 = method.add2(35, 45.2f);
        System.out.println("add2 =" + result2);

        System.out.println(method.add(45, 55));

        method.print("홍길동", "s123");

        int arr[] = { 1, 2, 3 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public void name() {

    }
}
