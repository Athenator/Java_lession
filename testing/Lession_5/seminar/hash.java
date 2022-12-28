import java.util.*;

public class hash {
    public static void main(String[] args) {
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(3,3);
        map1.put(1,1);
        map1.put(2,2);
        System.out.println("map1 = "+map1); // отсортированный список
        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        map2.put(3,3);
        map2.put(1,1);
        map2.put(2,2);
        System.out.println("map2 = "+map2); // обычный список
    }
}
