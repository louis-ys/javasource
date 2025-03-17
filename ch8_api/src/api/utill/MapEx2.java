package api.utill;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import api.obgect.Person;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("1234", "허"));
        map.put(2, new Person("1334", "호"));
        map.put(3, new Person("1434", "후"));
        map.put(4, new Person("1534", "하"));
        map.put(5, new Person("1634", "홍"));

        Set<Integer> set = map.keySet();
        // Iterator<Integer> iter = set.iterator();
        // while (iter.hasNext) {
        // Integer key = iter.naxt();
        // Person p = map.get(key);
        // System.out.println(p);

        // }

        System.out.println(map);
    }

}
