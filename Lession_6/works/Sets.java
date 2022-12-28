import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>(List.of (1,2,3,4,5,66,7));

        Set<Integer> hashS = new TreeSet<Integer>(List.of (1,2,3,4,5,66,7));

        Set<Integer> hash = new LinkedHashSet<Integer>(List.of (1,2,3,4,5,66,7));
        System.out.println(hashSet);
        System.out.println(hashS);
        System.out.println(hash);
    }
    
}