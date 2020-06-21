package thread.class1;

public class ThreadDemo {
  public static void main(String[] args) {
    //
    MyThread t = new MyThread();
    t.setName("Tthread");
    t.test();
    // System.out.println("T thread mane: " + t.getName());

    //    MyThreadRunnable mt = new MyThreadRunnable();
    //    Thread t1 = new Thread(mt, "T1Thread");
    //    t1.start();
    //    System.out.println("T1 thread name:" + t1.getName());
    //    System.out.println(Thread.currentThread().getName());

  }
}
