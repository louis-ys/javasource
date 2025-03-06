import java.util.Scanner;

public class ForEx12 {

    // 중첩 for

    //
    public static void main(String[] args) {
        // 4x +5y = 60
        // x,y는 10 이하의 자연수

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (x * 4 + 5 * y == 60) {

                    System.out.printf("(%d ,%d) ", x, y);
                }

            }
        }

    }

}
