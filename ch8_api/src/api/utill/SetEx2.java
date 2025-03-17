package api.utill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {

        Set<Integer> lotto2 = new HashSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또번호
            int num = (int) (Math.random() * 45) + 1;
            lotto2.add(num);

        }
        System.out.println(lotto2);

        List<Integer> list = new ArrayList<>(lotto2);

        list.sort(Comparator.reverseOrder());

        System.out.println(lotto2);
        System.out.println(Comparator.reverseOrder());
        System.out.println(Comparator.naturalOrder());

    }

}
