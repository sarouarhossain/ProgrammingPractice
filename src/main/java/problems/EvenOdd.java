package problems;

import java.util.Scanner;

public class EvenOdd {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    //
    int t;
    t = scanner.nextInt();
    Integer[] n = new Integer[t];
    for (int i = 0; i < t; i++) {
      n[i] = scanner.nextInt();
    }

    for (Integer x : n) {
      if (x % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}
