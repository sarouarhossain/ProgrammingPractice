package fundamentals;

public class Demo {
  Demo() {
    System.out.println("from constructor");
  }

  static int x = 5;
  static int y = 6;

  static void test1() {
    System.out.println(x);
  }

  static void test2() {
    System.out.println(y);
  }

  public static void main(String[] args) {
    //
    Demo demo = new Demo();
    test2();
    test1();
  }

  static {
    System.out.println("Hello from static blog");
  }
}
