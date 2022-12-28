import java.util.*;

public class poppoll {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1,2,3,4));
        while (!li.isEmpty()){
            System.out.println(li.pollLast());
        }
    }

}
