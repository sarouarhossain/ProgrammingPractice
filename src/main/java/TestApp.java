public class TestApp {
  public static void main(String[] args) {
    int n = 5;
    printC(n);
  }

  static void printC(int n) {
    if (n == 0) return;
    printC(n - 1);
    System.out.println(n);
  }
}
