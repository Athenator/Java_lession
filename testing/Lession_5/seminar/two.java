import java.util.HashSet;
import java.util.Set;

public class two {
    public static void main(String[] args) {
        // Опеределить есть ли в массиве дупликаты, если есть то вывести на экран true
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        Set<Integer> set = new HashSet<>();
        // Альтернативено решение
        // for (int i = 0; i < arr.length; i++) {
        //     if(set.contains(arr[i])){
        //         f = false;
        //         break;
        //     }else {
        //         set.add(arr[i]);
        //     }
        // 
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
            if (arr.length != set.size()) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
    

    }
}
