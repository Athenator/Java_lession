package Home;

import java.util.*;


public class First {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы списка, введите 0 для того, чтобы закончить список: ");
        int n = scanner.nextInt();
        while (n != 0) {
            lst.add(n);
            n = scanner.nextInt();
        }
        System.out.println("Обычный список = " + lst);
        reverse(lst);
        System.out.println("Развернутый список = " + lst);
       

        scanner.close();
    }

    public static void reverse(LinkedList<Integer> list) {
        for(int i = 0, m = list.size()/2, j = list.size() - 1; i < m; i++, j--){
            list.set(i, list.set(j, list.get(i)));
        }
        
    }
    
    
   


}
