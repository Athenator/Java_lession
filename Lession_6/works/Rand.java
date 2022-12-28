import java.util.*;

public class Rand {
    public static void main(String[] args) {
        int[] arr = createArr(1000);
        System.out.printf("Процент уникальных чиссел %.2f %%", counter(arr));
    }

    public static int[] createArr(int lenght) {
        Random random = new Random();
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    public static double counter(int[] arr) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int x : arr) {
            hashSet.add(x);
        }
        System.out.println(hashSet);
        return hashSet.size() * 100 / (double) arr.length;
        

    }
}
