public class BreakEx3 {
    public static void main(String[] args) {
        // 주사위 눈이 6이 나올때 까지

        int num = 0;
        while (true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 : %d\n", num);

            if (num == 6)
                break;

        }
    }
}
