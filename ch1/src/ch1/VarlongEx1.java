package ch1;

// byte : 1byte = 8비트
//  숫자 표현 : 2의 8승 = 256, 음수부터 표헌 256/2  => -128 ~ 127 표현 가능

public class VarlongEx1{
    public static void main(String[] args) {
    //  변수
    //  기본타입 : 정수형, 문자형, 실수형, 불린형
    //  정수형 byte(1), short(2), int,(4) long(8)
    //  문자형 : char
    //  실수형 : float, double
    //  불린형 : boolean

    //  변수선언 : 타입 변수명 = 값;
    //  변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
    //  max-speed : 데이터베이스 필드명
    //  long : L,l 둘다가능   롱은 뒤에 L을 붙여야 롱으로 적용 됨 
    long age = 15L, maxSpeed = 100L;
    long max = 256L;
    long money = 1000000000000L;

    // System.out.println(age);
    // System.out.println(maxSpeed);
    age = 30;
    // 의미
    //  + : 산술연산
    //  + : 연결(문자)

    System.out.println("나이 : "+age +", 최고속도 : " + maxSpeed + ", max : "+max);
    System.out.println("나이 : "+age +", 최고속도 : " + maxSpeed + ", max : "+max);
    System.out.println(money);
    

    
    // 변수 값 변경시 타입 작성 X 
 
 
    }
}
