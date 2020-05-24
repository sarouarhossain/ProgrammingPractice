package recursion;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class NaturalNumberSum {
  public static void main(String[] args) {
    NaturalNumberSum numberSum = new NaturalNumberSum();
    Integer n = 5000;
    LocalDateTime x = LocalDateTime.now();
    System.out.println(x);
    System.out.println("Sum: " + numberSum.sumRec(n));
    LocalDateTime y = LocalDateTime.now();
    System.out.println(y);
    System.out.println("Time Difference: " + ChronoUnit.MILLIS.between(x, y));
  }

  // time complexity O(1)
  Integer mostEfficientWay(Integer n) {
    return n * (n - 1) / 2;
  }

  // time complexity O(n), space complexity O(n)
  Integer sumRec(Integer n) {
    if (n == 1) return 1;
    return n + sumRec(n - 1);
  }

  // time complexity O(n)
  Integer sumLoop(Integer n) {
    Integer sum = 0;
    for (Integer i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  // time complexity O(n)
  Integer sumWhile(Integer n) {
    Integer sum = 0;
    while (n >= 1) {
      sum += n;
      n--;
    }
    return sum;
  }
}
