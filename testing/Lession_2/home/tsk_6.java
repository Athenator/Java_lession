package home;
//  Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class tsk_6 {
    public static void main(String[] args) {
        int sum = 0;
        int[] mass = new int[] { -12, 213, -552, 45, -88, 382 };
        for (int i = 0; i < mass.length; i++) {
            if (Integer.toString(mass[i]).length() == 2) {
                sum += i;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if(mass[i] < 0){
                mass[i] = sum;
            }

            System.out.println(mass[i]);
        }

       
    }
}
