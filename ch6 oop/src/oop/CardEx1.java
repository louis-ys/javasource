package oop;

//  변수 종류 
// 1. 지역변수 : 메서드, 생성자, 초기화 블럭 내부 등에서 선언 / 변수 선언문이 실행될 때
// 2. 인스턴스변수 : 클래스 영역  / 인스턴스가 생성되었을 때 (new Card())
// 3. 클래스변수 : 클래스 영역 / 클래스가 메모리에 올라갔을 때  (클래스 작성이 완료되면)

public class CardEx1 {
    public static void main(String[] args) {

        // static 으로 선언된 변수와 메서드는 클래스이름. 접근

        System.out.println("카드 너비" + Card.width);
        System.out.println("카드 높이" + Card.height);

        Card card = new Card();
        card.kind = "다이아";
        card.number = 7;
        Card card2 = new Card();
        card.kind = "Spade";
        card.number = 7;

    }

}
