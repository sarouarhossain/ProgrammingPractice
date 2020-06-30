import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    //
    System.out.println("Input: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    //    long start1 = System.currentTimeMillis();
    //    int sumMethodOneResult = sumMethodOne(n);
    //    long end1 = System.currentTimeMillis();
    //    System.out.println("Output from method one: " + sumMethodOneResult);
    //    System.out.println("Calculation time: " + (start1 - end1));
    //
    //    long start2 = System.currentTimeMillis();
    //    int sumMethodTwoResult = sumMethodTwo(n);
    //    long end2 = System.currentTimeMillis();
    //    System.out.println("Output from method two: " + sumMethodTwoResult);
    //    System.out.println("Calculation time: " + (start2 - end2));

    long start3 = System.currentTimeMillis();
    int sumMethodThreeResult = sumMethodThree(n);
    long end3 = System.currentTimeMillis();
    System.out.println("Output from method three: " + sumMethodThreeResult);
    System.out.println("Calculation time: " + (end3 - start3));
  }

  /**
   * summation of 1 to n natural numbers using formula n*(n-1)/2
   *
   * @param n int limit
   * @return int summation
   */
  static int sumMethodOne(int n) {
    int sum;
    sum = n * (n + 1) / 2;
    return sum;
  }

  /**
   * summation of 1 to n natural numbers using loop
   *
   * @param n int limit
   * @return int summation
   */
  static int sumMethodTwo(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }

    return sum;
  }

  /**
   * summation of 1 to n natural numbers using loop
   *
   * @param n int limit
   * @return int summation
   */
  static int sumMethodThree(int n) {
    if (n == 1) return 1;
    return n + sumMethodThree(n - 1);
  }
}
