import java.util.Scanner;

public class tsk_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Число n = ");
        int n = iScanner.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

}