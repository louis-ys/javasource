package condition;

import java.util.Scanner;

//  특정 조건을 만족하면 문장 실행
//  if(조건문){}
//  특정 조건을 만족하면 구문 1 실행 만족하지 않을 때는 구문 2 실행
// if(조건문){구문1}else{구문2}

public class IfTest5 {
    public static void main(String[] args) {

        // 주사위 1~6
        // 0.0 <= Math.random() < 1.0
        // System.out.println(Math.random());
        // ((Math.random()*6) : 0 ~ 5 ) + 1
        int num = (int) (Math.random() * 6) + 1;

        // num 이 1이면 주사위 1번이 나왔습니다.

        if (6 == num) {
            System.out.println("주사위 6번이 나왔습니다");

        } else if (5 == num) {
            System.out.println("주사위 5번이 나왔습니다");

        } else if (4 == num) {
            System.out.println("주사위 4번이 나왔습니다");

        } else if (3 == num) {
            System.out.println("주사위 3번이 나왔습니다");

        } else if (2 == num) {
            System.out.println("주사위 2번이 나왔습니다");

        } else {
            System.out.println("주사위 1번이 나왔습니다");

        }

    }
}
