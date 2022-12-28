package seminar;

import java.util.*;

public class three {
    // Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите колличество элементов в списке: ");
        int n = scanner.nextInt();
        while(n != 0){
            integerLinkedList.add(n);
            n = scanner.nextInt();
        }
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) < 0){
                integerLinkedList.remove(i);
                i--;
            }
        }
        System.out.println("List = " + integerLinkedList);
    }
}
