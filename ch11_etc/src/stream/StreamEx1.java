package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍", "성", "김");

        for (String string : list) {

        }

        // Iterator

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }

        // Strem
        Stream<String> stream = list.stream();

        // Consumer<String> action;
        // forEach(Consumer<? super String> action) : void
        stream.forEach(s -> System.out.println(s));

        // List<Student> student = Arrays.asList(new Student("홍길동", 0));
    }

}
