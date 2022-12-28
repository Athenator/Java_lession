package home;
import java.util.Scanner;

// Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.

public class tsk_1 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество чисел: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите отрицательное или положительное число: ");
            mass[i] = scanner.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            if(mass[i] < 0){
                if(mass[i + 1] > 0 ){
                    k++;
                }
            } 
        }
        System.out.println("Колличество положительных чисел, следующих за отрицательными = " + k);
        scanner.close();

    }
    

}
