package oop;

public class MyMath {

    // 오버로딩
    // 메서드 오버로딩 : 한 클래스내에 같은 이름의 메서드를 여러 개 정의하는 것
    // 생성자 오버로딩 : 한 클래스내에 같은 이름의 생성자를 여러 개 정의하는 것
    // 오버로딩 조건
    // 1. 메서드명이 같아야 한다.
    // 2. 매개변수의 개수 또는 타입이 달라야 한다.

    int add(int a, int b) {
        System.out.println(" int add( int a, int b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println(" long add( long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println(" long add( int a, long b)");
        return a + b;
    }

    int add(int a[]) {
        System.out.println(" long add( int a, long b)");
        int sum = 0;
        for (int i : a) {
            sum += i;

        }

        return sum;

    }

}
