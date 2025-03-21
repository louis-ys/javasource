package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("ap", "gr", "me", "wa", "ba");

        Stream<String> stream = fruits.stream();
        // peek(Consumer<? super String> action) : Stream<String>
        stream.map(s -> s.toUpperCase())
                .peek(s -> System.out.println("확인" + s))
                .forEach(s -> System.out.println(s));

        Stream<File> stream2 = Stream.of(new File("file1.txt"),
                new File("file2.txt"), new File("file3"),
                new File("file4.bak"), new File("file1.java"));

        stream2.map(f -> f.getName()) // { " file1", ...}
                .filter(f -> f.indexOf(",") > -1)
                .map(f -> f.substring(f.lastIndexOf(",") + 1))
                .distinct()
                .forEach(f -> System.out.println(f));

        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));

    }
}
