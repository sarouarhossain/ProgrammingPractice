package thread;

public class MainClass {
  public static void main(String[] args) {
    //
    MyThread myThread = new MyThread();
    myThread.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }
    System.out.println(Thread.currentThread().getName());
  }
}
