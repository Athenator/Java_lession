package seminar;

import java.util.LinkedList;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        // Заполнить и найти сумму четных элементов списка
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите колличество элементов в списке: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }

        for (int i = 0; i < integerLinkedList.size(); i++) {
            if(integerLinkedList.get(i) % 2 == 0) {
                sum += integerLinkedList.get(i);
            }
        }
        System.out.println("Sum = " + sum);

        // System.out.println("peek = " + integerLinkedList.peek());
        // System.out.println("list = " + integerLinkedList);
        // System.out.println("pop = " + integerLinkedList.pop());
        // System.out.println("list = " + integerLinkedList);
        // integerLinkedList.addFirst(3);
        // System.out.println("first list = " + integerLinkedList);
        // integerLinkedList.addLast(7);
        // System.out.println("last list = " + integerLinkedList);
        // // замена элемента по индексу
        // integerLinkedList.set(2, 6);
        // //проверить на наличие элемента
        // integerLinkedList.contains(6);
        // //удаление элемента
        // integerLinkedList.remove(2);
        // integerLinkedList.remove((int)2);
    }
}
