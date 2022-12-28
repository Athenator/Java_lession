
import java.util.Scanner;
public class tsk_3 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите 2 числа:\n");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nВведите знак (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка, неверно введён знак!");
            return;
      }
      System.out.print("\nРезультат:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}