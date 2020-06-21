package thread.class1;

public class ThreadDemoOne {
  public static void main(String[] args) {
    //
    MyThreadTwo mt = new MyThreadTwo();
    mt.setName("MT");
    mt.start();
    mt.test();
  }
}
