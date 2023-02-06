import java.util.Scanner;

public class ArithmeticProgression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Количество сумм,которые надо вывести");
    int i = scanner.nextInt();


    for (int x = 0; x < i; x++) {
      System.out.print("первое значение арифметической прогрессии");
      int A = scanner.nextInt();
      System.out.print("шаг");
      int B = scanner.nextInt();
      System.out.print("количество членов прогрессии");
      int N = scanner.nextInt();
      int SUM = ((2 * A + B * (N - 1)) / 2) * N; // формула для расчета суммы арифметической прогрессии

      System.out.print(SUM + " ");
    }
  }
}
