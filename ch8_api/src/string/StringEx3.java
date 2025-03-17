package string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "Hello";
        // 문자열 연결 : +
        str += " World";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세요";
        str2 = str2.concat("반갑습니다.");
        System.out.println(str2);

        // endsWith(), startsWith()

        System.out.println(str.endsWith("요"));
        System.out.println(str.startsWith("요"));

        String file = "test.txt";
        // 이미지 : png or gif or jpg
        if (file.endsWith("jpg") || file.endsWith("png") || file.endsWith("gif")) {
            System.out.println("이미지 파일입니다.");

        } else {
            System.out.println("이미지 파일이 아닙니다.");
        }
        // replace() 결과는 새로운 문자열로 반환
        System.out.println("replace(old,new)" + str.replace("Hello", "안녕하세요"));
        System.out.println(str);
        // 원본 변경
        str = str.replace("Hello", "안녕하세요");
        System.out.println(str);

        // substring() : 새로운 문자열 반환
        str2 = "java.lang.Object";
        System.out.println(" 특정 위치의 문자열 얻기 " + str2.substring(10));
        System.out.println(" 특정 위치의 문자열 얻기 " + str2.substring(4, 9));

        // split()
        str2 = "dog,cat,bear";
        System.out.println(Arrays.toString(str2.split(",")));

        // System.out.println(Arrays.toString());

        // 대 소문자 변경
        str2 = "HELLO";
        System.out.println("소문자" + str2.toLowerCase());
        System.out.println("대문자" + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        String str3 = "        hee      ";
        System.out.println(str3);
        System.out.println(str3.trim());

        String str4 = String.valueOf(1);
    }

}
