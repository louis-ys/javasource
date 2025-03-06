package oop;

public class Square {
    // 정사각형
    // 속성 : 길이 (sidelength)
    // 기능 : 면적 구하기

    int sidelength;

    public Square() {
    }

    public Square(int sidelength) {
        this.sidelength = sidelength;
    }

    @Override
    public String toString() {
        return "Square [sidelength=" + sidelength + "]";
    }

    double a1() {
        return sidelength * 2;
    }
}
