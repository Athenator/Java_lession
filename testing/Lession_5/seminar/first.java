import java.util.*;

public class first {
    public static void main(String[] args) {
        //  посчитать колличество вхождений каждой буквы в текст.
        Map <Character,Integer> map = new HashMap<>();
        String str = "asa sfawq wqrsaf sxsasaxbb";

        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i), 0);
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            // if(map.containsKey(str.charAt(i))){
            //     map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            // }else{
            //     map.put(str.charAt(i),1);
            // }
        }
        // for (Map.Entry<Character,Integer> entry : map.entrySet())
            for (var entry : map.entrySet()) {
                System.out.println("Буква - "+entry.getKey()+ " , встретилась : "+entry.getValue());
            }
        
    }
}
