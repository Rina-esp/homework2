import java.util.Scanner;

public class Compare {
  public static void main( String args[] ) {
    Scanner input = new Scanner(System.in);
    int num1, num2;

    System.out.print( "Введите число номер 1: " );
    num1 = input.nextInt();

    System.out.print( "Введите число номер 2: " );
    num2 = input.nextInt();

    if ( num1 == num2 )
      System.out.printf( "Номер 1 равен номеру 2\n", num1, num2 );
    else if ( num1 < num2 )
      System.out.printf( "Номер 1 меньше номера 2\n", num1, num2 );
    else if ( num1 > num2 )
      System.out.printf( "Номер 1 больше номера 2\n", num1, num2 );
  }
}
