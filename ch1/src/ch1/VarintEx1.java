package ch1;

// byte : 1byte = 8비트
//  숫자 표현 : 2의 8승 = 256, 음수부터 표헌 256/2  => -128 ~ 127 표현 가능

public class VarintEx1{
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
    int age = 15, maxSpeed = 100;
    int max = 256;

    // System.out.println(age);
    // System.out.println(maxSpeed);
    age = 30;
    // 의미
    //  + : 산술연산
    //  + : 연결(문자)
    System.out.println("나이 : "+age +", 최고속도 : " + maxSpeed + ", max : "+max);
    System.out.println(age + maxSpeed + max);

    
    // 변수 값 변경시 타입 작성 X 
    // 형식화된 출력 (엔터는 안들어가 있음)
    // %b : boolean, %d : 정수, %f : 실수, %s : 문자열, %c : 문자
    System.out.printf("나이 : %d, 최고속도 : %d, max : %d\n",age,maxSpeed,max);

    
    }
}
