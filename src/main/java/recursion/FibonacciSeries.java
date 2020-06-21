package recursion;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class FibonacciSeries {
  static Integer count = 0;
  Integer[] A = new Integer[100000];

  public static void main(String[] args) {
    //
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    Arrays.fill(fibonacciSeries.A, -1);
    Integer n = 1000;
    LocalDateTime x = LocalDateTime.now();
    System.out.println("Sum: " + fibonacciSeries.fibRecBetterWay(n));
    LocalDateTime y = LocalDateTime.now();
    System.out.println(x);
    System.out.println(y);
    System.out.println("Time Difference: " + ChronoUnit.MILLIS.between(x, y));
    System.out.println("Stack count: " + count);
  }

  Integer fibIterative(Integer n) {
    Integer t1 = 0, t2 = 1, i, sum = 0;

    for (i = 2; i <= n; i++) {
      sum = t1 + t2;
      t1 = t2;
      t2 = sum;
    }

    return sum;
  }

  // time complexity O(2^n), space complexity O(n)
  Integer fibRec(Integer n) {
    count++;
    if (n <= 1) return n;
    return fibRec(n - 2) + fibRec(n - 1);
  }

  // time complexity O(n), space complexity O(n)
  Integer fibRecBetterWay(Integer n) {
    // n=2
    count++;
    if (n <= 1) {
      A[n] = n;
      return n;
    } else {
      if (A[n - 2] == -1) A[n - 2] = fibRecBetterWay(n - 2);
      if (A[n - 1] == -1) A[n - 1] = fibRecBetterWay(n - 1);
      return A[n - 2] + A[n - 1];
    }
  }
}
