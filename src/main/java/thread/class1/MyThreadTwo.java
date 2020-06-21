package thread.class1;

public class MyThreadTwo extends Thread {
  @Override
  public void run() {
    System.out.println("X: " + Thread.currentThread().getName());
    test();
  }

  public void test() {
    System.out.println("Y: " + Thread.currentThread().getName());
  }
}
// X: MT
// Y: main
// Y: MT
