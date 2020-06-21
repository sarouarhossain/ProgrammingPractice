package thread.synchronizedpractice;

public class DisplayTwo {
  public void greetings(String name) {

    for (int i = 0; i < 3; i++) {
      System.out.println("upper part: " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    synchronized (DisplayTwo.class) {
      for (int i = 0; i < 3; i++) {
        System.out.println("Good morning: " + name + " : " + Thread.currentThread().getName());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    //    for (int i = 0; i < 3; i++) {
    //      System.out.println("Good morning: " + name + " : " + Thread.currentThread().getName());
    //      try {
    //        Thread.sleep(1000);
    //      } catch (InterruptedException e) {
    //        e.printStackTrace();
    //      }
    //    }

    for (int i = 0; i < 3; i++) {
      System.out.println("lower part: " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
