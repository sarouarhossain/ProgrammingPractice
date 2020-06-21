package thread.class1;

public class ThreadDemoTwo {
  public static void main(String[] args) {
    // anonymous class
    //    Runnable runnable =
    //        new Runnable() {
    //          @Override
    //          public void run() {
    //            System.out.println("X :" + Thread.currentThread().getName());
    //            threadDemoTwo.test();
    //          }
    //        };
    // anonymous class with lambda
    ThreadDemoTwo threadDemoTwo = new ThreadDemoTwo();
    Runnable runnable =
        () -> {
          System.out.println("X :" + Thread.currentThread().getName());
          threadDemoTwo.test();
        };

    Thread t = new Thread(runnable, "NewThread");
    t.start();

    threadDemoTwo.test();
  }

  public void test() {
    System.out.println("Y: " + Thread.currentThread().getName());
  }
}
// X: NewThread
// Y: NewThread
// Y: main
