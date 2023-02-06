public class List {
  public static void main(String args[]) {
    System.out.println("\nЧисла делятся на 3: ");
    for (int i=1; i<100; i++) {
      if (i%3==0)
        System.out.print(i +", ");
    }

    System.out.println("\nЧисла делятся на 5: ");
    for (int i=1; i<100; i++) {
      if (i%5==0) System.out.print(i +", ");
    }

    System.out.println("\nЧисла делятся на  3 и 5: ");
    for (int i=1; i<100; i++) {
      if (i%3==0 && i%5==0) System.out.print(i +", ");
    }
    System.out.println("\n");
  }
}
