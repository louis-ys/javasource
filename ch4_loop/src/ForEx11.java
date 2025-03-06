import java.util.Scanner;

public class ForEx11 {

    // 중첩 for

    //
    public static void main(String[] args) {

        // for (int i = 2; i < 10; i++) {
        // for (int j = 1; j < 10; j++) {
        // System.out.printf("%d * %d = %d\n", i, j, (j * i), "t\n");

        // }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\t", j, i, (j * i));

            }
            System.out.println();
        }

    }
}
