package api.utill;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringtokenEx {
    public static void main(String[] args) {

        String str = " this is a test";
        StringTokenizer st = new StringTokenizer(str); // 구분자 없으면 공백으로 분리

        // split()
        System.out.println(Arrays.toString(str.split(" ")));

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());

        }
        System.out.println();
        str = "this/is/a/test";
        st = new StringTokenizer(str, "/");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");

        }
        System.out.println();

        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90,";
        // st = new StringTokenizer(source, ",|");
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken() + "\t");
        // }

        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {

            String tokewn = st.nextToken();

            StringTokenizer st2 = new StringTokenizer(tokewn, ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("-----------------");
        }

        System.out.println();
    }

}
