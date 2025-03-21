package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx2 {
    public static void main(String[] args) {

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0인 경우 빈문자열입니다. 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test(""))
            System.out.println("빈 문자열입니다.");

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후 짝수라면 짝수입니다. 아닌경우 홀수입니다.
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        {

            if (predicate2.test(5)) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
        // T : type, R : return type
        // 숫자를 문자로 반환
        Function<Integer, String> f = (i) -> String.valueOf(i);
        System.out.println(f.apply(35));
        // 사칙연산
        BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
        System.out.println(f2.apply(5, 4));
    }

}
