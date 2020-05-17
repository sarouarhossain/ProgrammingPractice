package recursion;

public class NaturalNumberSum {
  public static void main(String[] args) {
    NaturalNumberSum numberSum = new NaturalNumberSum();
    int sum = numberSum.sumRec(5);
    System.out.println("Sum: " + sum);
  }

  int sumRec(int n) {
    if (n == 1) return 1;
    return n + sumRec(n - 1);
  }

  int sumLoop(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  int sumWhile(int n) {
    int sum = 0;
    while (n >= 1) {
      sum += n;
      n--;
    }
    return sum;
  }
}
