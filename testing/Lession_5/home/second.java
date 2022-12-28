package home;

import java.util.HashMap;

public class second {
    public static void main(String[] args) {
        String [] mas1 = new String[] {"qwe","asd","qwe","x"};
        String [] mas2 = new String[] {"qwe","v"};
        HashMap<String, Integer> lst = new HashMap<>();
        for (String word : mas1) {
            if (!lst.containsKey(word)) {
                lst.put(word, 0);
            }
            lst.put(word, lst.get(word) + 1);
        }
        for (String word : mas2) {
            if (!lst.containsKey(word)) {
                lst.put(word, 0);
            }
            lst.put(word, lst.get(word) + 1);
        }
        
        for (String word : lst.keySet()) {
                if (lst.get(word) > 1) {
                    System.out.println(word + " = " + lst.get(word));
                }
            }
        
    }
}
