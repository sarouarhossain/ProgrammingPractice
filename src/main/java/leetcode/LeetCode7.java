package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode7 {
  public static void main(String[] args) {
    Integer x = 1463847412;

    boolean isNeg = false;
    if (x < 0) {
      x = -1 * x;
      isNeg = true;
    }
    int res = 0;
    while (x > 0) {
      if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE && x / 10 > 7)) {
        res = 0;
        break;
      }
      res = res * 10 + x % 10;
      x = x / 10;
      System.out.println(res + " : " + x);
    }
    if (isNeg) res = -1 * res;
    System.out.println(res);
  }
}
