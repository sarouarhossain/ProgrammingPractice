package thread.synchronizedpractice;

public class Display {
  public synchronized void greetings(String name) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Good morning: " + name + " : " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void test(String name) {
    System.out.println("Testing from " + name + " " + Thread.currentThread().getName());
  }
}
