package api.utill;

import java.util.ArrayList;
import java.util.List;

import api.obgect.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        List<Person> list = new ArrayList<>();
        list.add(new Person("ho", "홍"));
        list.add(new Person("ho1", "호"));
        list.add(new Person("ho2", "후"));
        list.add(new Person("ho3", "허"));
        list.add(new Person("ho4", "하"));

        System.out.println("아이디\t 이름");
        System.out.println("----------------");

        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }

    }
}
