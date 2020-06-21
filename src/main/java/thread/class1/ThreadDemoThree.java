package thread.class1;

public class ThreadDemoThree {
  public static void main(String[] args) {
    //
    Runnable runnableOne =
        () -> {
          // System.out.println("NewThread thread priority: " +
          // Thread.currentThread().getPriority());
          for (int i = 0; i < 10; i++) {
            System.out.println("NewThread: " + i);
          }
        };

    Thread.currentThread().setPriority(7);
    Thread t = new Thread(runnableOne, "NewThread");
    t.start();
    t.setPriority(9);

    // System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

    for (int i = 0; i < 10; i++) {
      System.out.println("MainThread: " + i);
    }
  }
}
