package thread.class1;

public class ThreadDemoFour {
  public static void main(String[] args) throws InterruptedException {
    //
    Thread thread1 =
        new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {
                System.out.println("Thread1: " + i);
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }
            });
    thread1.setPriority(8);

    Thread thread2 =
        new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {
                System.out.println("Thread2: " + i);
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }
            });
    thread1.start();
    thread2.start();
    thread2.join();
  }
}
