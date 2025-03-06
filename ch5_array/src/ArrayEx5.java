import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        // char 값 5개
        // 값을 알고 있을때 방법 int[] = {};
        char charr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배열 선언, 생성

        // 배열 길이
        System.out.println(" 길이 : " + charr.length);

        // 배열 요소 확인

        System.out.println(charr);
        System.out.println(Arrays.toString(charr));
        // 배열 요소 변경

        charr[2] = 'f';
        System.out.println(Arrays.toString(charr));

        // double 배열 선언, 생성 (5)

        double arr[] = { 90.5, 88.12, 78.45, 62.4, 55 };
        System.out.println(arr); // [D@1be6f5c3 < 주소 같은거
        System.out.println(Arrays.toString(arr));
        // Arrays.toString 배열이 가리키는 곳의 실제 값을 출력
    }

}
