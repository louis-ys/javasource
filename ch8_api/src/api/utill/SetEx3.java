package api.utill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import api.obgect.Person;

public class SetEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        Set<Person> set = new HashSet<>();
        set.add(new Person("ho", "홍"));
        set.add(new Person("ho1", "호"));
        set.add(new Person("ho2", "후"));
        set.add(new Person("ho", "홍"));
        set.add(new Person("ho4", "하"));

        for (Person person : set) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
        System.out.println(new Person("ho", "홍").hashCode());
        System.out.println(new Person("ho", "홍").hashCode());

    }
}
