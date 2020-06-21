package thread.interThreadCommunication;

public class ThreadA extends Thread {
  int total = 0;

  @Override
  public void run() {
    synchronized (this) {
      System.out.println("Total calculation started.");
      for (int i = 1; i <= 100; i++) {
        total += i; // 5050
        //              System.out.println("Total: " + total + "  i: " + i);
      }
      System.out.println("Total Calculation end, now notifying");
      this.notifyAll();
    }
  }
}
