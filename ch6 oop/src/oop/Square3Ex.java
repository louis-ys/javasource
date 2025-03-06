package oop;

import java.util.Arrays;

public class Square3Ex {
  // 정사각형
  // 속성 : 길이 (sidelength)
  // 기능 : 면적 구하기

  public static void main(String[] args) {

    // 객체 배열
    // 타입 배열명[] = new 타입 [개수];
    // 객체(클래스)명 배열명[] = new 객체 (클래스)명 [5];
    Square squ[] = new Square[5];
    System.out.println(Arrays.toString(squ)); // [null, null, null, null, null]

    // 객체 배열 초기화
    // squ[0] = new Square(); // sideLenght =0
    // squ[1] = new Square();
    // squ[2] = new Square();
    // squ[3] = new Square();
    // squ[4] = new Square();

    for (int i = 0; i < squ.length; i++) {
      squ[i] = new Square();

    }
    squ[0].sidelength = 35;
    squ[1].sidelength = 15;
    squ[2].sidelength = 12;
    squ[3].sidelength = 5;
    squ[4].sidelength = 4;
    for (int i = 0; i < squ.length; i++) {
      System.out.printf("%d번째 면적 : %f\n", (i + 1), squ[i].a1());

    }

  }
}
