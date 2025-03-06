import java.util.Scanner;

public class ForEx13 {

    // 중첩 for

    //
    public static void main(String[] args) {
        // 1~ 100사이의 소수 구하기

        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.printf("%d ", i);
        }

        System.out.println();

    }

}
