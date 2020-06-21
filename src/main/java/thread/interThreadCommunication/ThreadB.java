package thread.interThreadCommunication;

public class ThreadB extends Thread {
  ThreadA t1;

  ThreadB(ThreadA t1) {
    this.t1 = t1;
  }

  @Override
  public void run() {
    synchronized (t1) {
      try {
        t1.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Total from ThreadB: " + t1.total);
    }
  }
}
