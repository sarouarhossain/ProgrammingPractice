package recursion;

public class Recursion16_05 {
  String x = "Text";
  public static Long count = 0l;

  public static void main(String[] args) {
    Recursion16_05 recur = new Recursion16_05();
    recur.funcRecur(100000000000l);
  }

  // time complexity O(n)
  // space complexity O(n)
  void funcRecur(Long n) {
    //    count++;
    //    System.out.println(count);
    if (n == 0) {
      return;
    } else {
      System.out.println(n);
      funcRecur(n - 1);
    }
  }

  // time complexity O(n)
  // space complexity O(1)
  void funcLoop(int n) {
    // String[] x = {"AA", "V"};
    int i;

    for (i = 0; i <= n; i++) {
      System.out.println(i); // 5 4 3 2 1 0
    }

    // 3, n*3 + 1 , 1000*3 +1 = 3001 = O(n)
    // O(1)

    //    for (i = n; i >= 0; i--) {
    //      System.out.println(i); // 5 4 3 2 1 0
    //    }
  }

  void funcWhileLoop(int n) {
    //    while (n >= 0) {
    //      System.out.println(n); // 5 4 3 2 1
    //      n--;
    //    }

    // n = 5
    int x = 1;
    while (x <= n) {
      System.out.println(x); // 1 2 3 4 5
      x++;
    }
  }
}
