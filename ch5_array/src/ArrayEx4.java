import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ?명 학생의 수학점수를 입력받아서 평균, 총합 구하기
        int[] arr; // 배열 선언

        System.out.println("학생의 수 입력 >> ");
        int num = sc.nextInt();
        // 배열 생성
        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째 학생 점수 입력 >> ", (i + 1));
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.printf("총합 : %d, 평균 : %.2f\n", sum, (double) sum / arr.length);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = i * 10 + 10;

        // 배열 요소의 값 확인
        // 1) for 문 사용 : 원하는 형태로 출력 가능
        // 2) 향상된 for 문 : 1) 번과 같음
        // 3)Arrays.toString (배열명) : [배열요소 출력] =확인용

        System.out.println(Arrays.toString(arr));
    }

}
