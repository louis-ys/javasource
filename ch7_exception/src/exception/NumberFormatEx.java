package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("입력 >>");

        try {

            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        sc.close();
    }

}
