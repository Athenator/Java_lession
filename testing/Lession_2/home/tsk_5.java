package home;
//  Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя цифры равны.
public class tsk_5 {
    public static void main(String[] args) {
        int sum = 0;
        int[] mass = new int[] { 122, 384, 552, 322, 888, 342 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 10 == (mass[i] % 100) / 10) {
                sum += mass[i];
            }
            
        }

        System.out.println("Сумма = " + sum);
    }
}
