package home;
// Дана последовательность N целых чисел. Найти сумму простых чисел.

public class tsk_3 {
    public static void main(String[] args) {
        int sum = 0;
        int[] mass = new int[] { 18, 2, 552, 31, 85, 101 };
        for (int i = 0; i < mass.length; i++) {
            if (checkSimple(mass[i])) {
                // System.out.println(mass[i]);
                sum += mass[i];
            }

        }
        System.out.println("Сумма простых чисел = " + sum);

    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

}
