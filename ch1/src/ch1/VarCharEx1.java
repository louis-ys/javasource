package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        //  공백도 문자 한개 취급
        //  문자  : 글자 한개  '가',' '
        //  문자열 : 글자 한개 ~여러개 "가", "가나다","   "
        char ch1 = '가';

        //  ch1의 값을 unicode 변수에 대입
        //  int = char
        int unicode = ch1;
        System.out.println("ch1 = "+ch1);
        System.out.println("unicode = "+unicode);  // '가' 문자의 unicode 값 44032


        char ch2 = 'a';    // 'a' 문자의 unicode 값 97

        unicode = ch2;

        System.out.println("ch2 = "+ch2);
        System.out.println("unicode = "+unicode);

        char ch3 = 'A';   // 'A' 문자의 unicode 값 65

        unicode = ch3;

        System.out.println("ch3 = "+ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = "+unicode);
    
    
    }
}
