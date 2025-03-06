import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };

        // 배열에 저장된 값 중에서 최대값과 최소값 구하기
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];

            } else if (min > score[i]) {
                min = score[i];

            }
            {

            }

        }

        System.out.println("최대 값 : " + max);
        System.out.println("최소 값 : " + min);
    }
}