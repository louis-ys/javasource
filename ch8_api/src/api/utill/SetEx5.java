package api.utill;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        String from = "b", to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println(set.subSet(from, to));
        System.out.println(set.subSet(from, to + "zzz"));
    }

}
