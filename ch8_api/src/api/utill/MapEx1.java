package api.utill;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // K : String, V : String
        Map<String, String> map = new HashMap<>();
        map.put("id_0111", "홍");
        map.put("id_0112", "홍");
        map.put("id_0113", "홍");
        map.put("id_0111", "홍");
        map.put("id_0114", "홍");

        // key 값 가져오기
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }

    }

}
