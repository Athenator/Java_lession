package seminar;

import java.util.LinkedList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // заменить некратные 3 элементы списка, суммой нечетных элементов
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите колличество элементов в списке: ");
        int n = scanner.nextInt();
        while(n != 0){
            if (n % 2 == 1){
                sum += n;
            }
            integerLinkedList.add(n);
            n = scanner.nextInt();
        }

        for (int i = 0; i < integerLinkedList.size(); i++) {
            if(integerLinkedList.get(i) % 3 != 0) {
                integerLinkedList.set(i, sum);
            }
        }
        System.out.println("List = "+ integerLinkedList);
    }
    
    

}
