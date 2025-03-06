package oop;

import java.util.Arrays;

public class Square2Ex {
  // 정사각형
  // 속성 : 길이 (sidelength)
  // 기능 : 면적 구하기

  public static void main(String[] args) {
    Square square = new Square(10);
    System.out.println("사각형 면적 " + square.a1());

    Square square2 = new Square(10);
    System.out.println("사각형 면적 " + square2.a1());

    // 객체 배열
    // 타입 배열명[] = new 타입 [개수];
    // 객체(클래스)명 배열명[] = new 객체 (클래스)명 [5];
    Square squ[] = new Square[5];
    System.out.println(Arrays.toString(squ)); // [null, null, null, null, null]
    squ[0] = new Square(15);
    // System.out.println("첫번째 면적" + squ[0].a1());
    squ[1] = new Square(20);
    // System.out.println("두번째 면적" + squ[1].a1());
    squ[2] = new Square(30);
    // System.out.println("세번째 면적" + squ[2].a1());
    squ[3] = new Square(40);
    // System.out.println("네번째 면적" + squ[3].a1());
    squ[4] = new Square(99);
    // System.out.println("다섯번째 면적" + squ[4].a1());

    for (int i = 0; i < squ.length; i++) {
      System.out.printf("%d번째 면적 : %f\n", (i + 1), squ[i].a1());

    }

    // 배열 기본타입으로 생성
    // 정수형-0, 실수형 0.0, 불린형-false
    int arr[] = new int[5];
    System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0]
    arr[0] = 15;
    arr[1] = 10;
    arr[2] = 20;
    arr[3] = 25;
    arr[4] = 35;
    for (int i = 0; i < arr.length; i++) {

      System.out.println(arr[i]);

    }

  }
}
