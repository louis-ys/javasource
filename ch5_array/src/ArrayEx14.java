import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {

        // 2차원 배열 (행, 열)
        // 타입 [] [] 배열명 = new 타입 [3] [3];

        // 값을 알고 있는 경우

        int score[][] = {
                { 100, 100, 100 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };

        System.out.println("번호 국어 영어 수확 총점 평균  ");
        System.out.println("=================================");
        for (int i = 0; i < score.length; i++) {
            int a1 = score[i][0];
            int b1 = score[i][1];
            int c1 = score[i][2];
            int sum = 0;
            float avg = 0.0f;
            System.out.printf("%3d  ", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%3d  ", score[i][j]);
                sum += score[i][j];

            }
            System.out.printf("%3d  %3.2f\n", sum, sum / (float) score[i].length);
            // System.out.printf(" %3d %3d %3d\n "a1,b1,c1);
        }
        System.out.println("=================================");

    }
}