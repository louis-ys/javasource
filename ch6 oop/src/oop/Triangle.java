package oop;

public class Triangle {
    // 속성 : 밑변, 높이
    // 기능 : 면적 구하기 ,gerArea()

    int baseLine;
    int height;

    public Triangle() {
    }
    // 생산자 목적
    // 인스턴스 변수 초기화

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    double getArea() {
        return baseLine * height / 2.0;
    }
}
