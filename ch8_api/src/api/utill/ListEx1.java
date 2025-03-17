package api.utill;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int
        List<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(55);
        list.add(45);

        System.out.println("특정 위치 요소 조회" + list.get(0));
        System.out.println("특정 위치 요소 제거" + list.remove(0));
        System.out.println("특정 dyth wprj" + list.remove(Integer.valueOf(35)));

        System.out.println(list);
    }

}
