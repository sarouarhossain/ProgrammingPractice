package thread.class1;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("X: " + Thread.currentThread().getName());
    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("MyThread: " + i);
    //    }
  }

  //  public void start() {
  //    //super.start();
  //  }

  public void test() {
    System.out.println("Y: " + Thread.currentThread().getName());
    super.start();
  }
}
