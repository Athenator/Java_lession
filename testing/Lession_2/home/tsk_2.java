package home;

// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.

public class tsk_2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] mass = new int[] { 18, 345, 552, 34, 85, 125 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 10 == 5) {
                if(mass[i-1] % 2 == 0) {
                    sum += mass[i];
                }
                
            }
        }

        for (int i = 0; i < mass.length; i++) {
            // mass[i] %= 2;

            // System.out.println(mass[i]);
        }

        System.out.println("Сумма чисел = " + sum);
    }
}
