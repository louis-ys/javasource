import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {

            ball[i] = i + 1;

        }
        System.out.println(Arrays.toString(ball));

        // 원본 배열의 0 ~ 5 위치에 있는 숫자만 교환
        for (int i = 0; i < 6; i++) {

            int pos = (int) (Math.random() * 45);
            int temp = ball[i];
            ball[i] = ball[pos];
            ball[pos] = temp;

        }
        System.out.println(Arrays.toString(ball));
    }
}