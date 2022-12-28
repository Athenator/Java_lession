import java.util.ArrayList;
import java.util.Random;

public class home_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        //рандомный список
        RandomCollection(list);
        //удаление четных чисел 
        delEvenNumbers(list);

    }

    public static void RandomCollection(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
            list.add(rnd.nextInt(10));
        System.out.println(list);
    }

    public static void delEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
    }

}