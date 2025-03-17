package string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {

        String str = "안녕하세요";
        System.out.println("문자열 길이" + str.length());
        System.out.println("지정된 위치에 있는 문자 변환" + str.charAt(0));
        System.out.println("지정된 위치에 있는 문자 변환" + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }

        // char[] charr = new char[5];
        char[] charr = new char[str.length()];

        // charr[0] = str.charAt(0);
        // charr[1] = str.charAt(1);
        // charr[2] = str.charAt(2);
        // charr[3] = str.charAt(3);
        // charr[4] = str.charAt(4);

        System.out.println("charr" + Arrays.toString(charr));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        char[] result = str.toCharArray();

        System.out.println("" + Arrays.toString(charr));

        System.out.println("주어진 문자가 문자열에 존재 여부 " + str.indexOf("안"));
        System.out.println("주어진 문자가 문자열에 존재 여부 " + str.indexOf("반"));

        System.out.println("주어진 문자가 문자열에 준재하는지 여부 " + str.contains("안"));

        String subject = "자바의 정석";
        // 자바 문자가 있으면 자바와 관련 있는 책입니다.
        System.out.println(subject.indexOf("자바"));

        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책입니다.");

        } else {
            System.out.println("자바와 관련 없는 책입니다.");

        }
        if (subject.contains("자바")) {
            System.out.println("자바와 관련 있는 책입니다.");

        } else {
            System.out.println("자바와 관련 없는 책입니다.");

        }

        // 찾는 시작위치 지정 가능
        System.out.println("찾는 시작위치 지정" + str.indexOf("하", 4));
        System.out.println("찾는 시작위치 지정 (끝에서 부터)" + str.lastIndexOf("하", 4));
        String str2 = "java.lnag.String";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.lastIndexOf("."));
    }

    // 문자열 길이

}
