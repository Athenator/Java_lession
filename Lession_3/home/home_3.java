import java.util.ArrayList;
import java.util.Random;

public class home_3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        RandomCollection(list);

        midArithmetic(list);

        MinMax(list);
    }

    public static void RandomCollection(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
            list.add(rnd.nextInt(10));
        System.out.println(list);
    }

    public static void midArithmetic(ArrayList<Integer> list) {
        double w = 0;
        for (Integer i : list)
            w += i;
        System.out.println("ср. арифм.= " + w / list.size());
    }

    public static void MinMax(ArrayList<Integer> list) {
        int max = 0;
        int min = 999999;
        for (Integer j : list) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
    }
}