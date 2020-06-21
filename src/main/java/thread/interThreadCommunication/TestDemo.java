package thread.interThreadCommunication;

public class TestDemo {
  public static void main(String[] args) throws InterruptedException {
    //
    ThreadA t1 = new ThreadA();
    ThreadB t2 = new ThreadB(t1);

    t1.start();
    t2.start();

    synchronized (t1) {
      System.out.println("Trying to get total value");
      t1.wait();
      System.out.println("We are notified, now can get updated total.");
      System.out.println("Total from main thread: " + t1.total); // ?? 5050\
    }

    System.out.println("Normal code");
  }
}
