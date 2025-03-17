package extend;

//  클래스간의 관계
//  1) 상속 관계 : isa
//  2) 포함 관계 : hasa
//  한 클래스 안에 다른 클래스가 멤버 변수로 선언

// 관계 결정하기 
//  public class Circle extends Point{}
//  extends : 원(circle)은 점(point)이다 : circle is a point
//  포함 : 원(circle)은 점(point)을 가지고 있다 : circle has a point

// Car, SportsCar 
// SportsCar 는 car이다  0  or SportsCar 는 car를 가지고 있다

public class Circle extends Shape {
    // int x;
    // int y;
    Point point;
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf(" [center= (%d,%d), r = %d, color =%s]\n",
                point.x, point.y, color);
    }

}
