package poly;

public class Car3 {
    // 멤버변수의 타입 : 기본 , 객체 (대문자 시작 , 배열)
    // 기본 : 정수형 = 0 실수 = 0.0 boolean = false
    // 객체 : null (무조건)

    Tire frontLeft;
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    // 1) 생성자
    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    // 초기화 1) 생성자 2) set메서드 3) 멤버변수 선언하면서 초기화 선언

}
