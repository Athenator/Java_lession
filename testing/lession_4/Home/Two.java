package Home;

import java.util.*;

public class Two {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы списка, введите 0 для того, чтобы закончить список: ");
        int n = scanner.nextInt();
        while (n != 0) {
            lst.add(n);
            n = scanner.nextInt();
        }
       
        for (int i = 0; i < lst.size()-1; i++) {
            if (lst.get(i) < 0){
                if(lst.get(i+1) < 0){
                    System.out.println("Список не является законочередующим!");
                    break;
                }
                
            }else if(lst.get(i) > 0) {
                if(lst.get(i+1) > 0){
                    System.out.println("Список не является законочередующим!");
                    break;
                }
            }
            
            System.out.println("Список законочередующийся.");
        }
        System.out.println("Список = " + lst);

        scanner.close();

    }
}
