package thread;

public class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread");
    }
    test();
    System.out.println(Thread.currentThread().getName());
  }

  public void test() {
    System.out.println("Child thread test method : " + Thread.currentThread().getName());
  }
}
