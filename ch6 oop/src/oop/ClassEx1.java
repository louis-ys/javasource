package oop;

//  oop ( Object Oriented Programming - 객체지향)
//  재사용성 높음
//  코드의 관리가 용이함 
//  신뢰성 높은 프로그램 작성

//  클래스 : 객체 정의, 설계도, 틀 
// 클래스 용도 : 객체 생성 

//  객체 : 사물 (책상,의자,자동차,TV), 개념(수확공식)

// 붕어빵 기계( 크

//  객체와 인스터스 
//  인스터스 : 어떤 클래스로부터 만들어진 객체 
//  책상은 책상 클라스의 인스턴스
public class ClassEx1 {
    public static void main(String[] args) {
        // 인스터스 생성
        // 클래스명 변수면 = new 클래스명();
        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성확인
        System.out.println(tv);
        System.out.println(tv2);

        // 인스터스 사용
        tv.color = "black";
        tv.channelUp();
        System.out.println("현재채널 :" + tv.channel);
        System.out.println("현재 색상 :" + tv.color);

        // 메소드 : ()
        tv2.powr(); // 메소드 호출 (메소드 실행)
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }

}
