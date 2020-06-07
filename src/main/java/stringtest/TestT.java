package stringtest;

public class TestT {
    public static synchronized void testPrint(){
        System.out.println("HELLO WORLD");
    }

  public static void main(String[] args) {
    //
//      TestT t = new TestT();
//      t.testPrint();
//      testPrint();
//      System.out.println(Thread.currentThread());

      StringBuffer sb = new StringBuffer("hello");
      System.out.println(sb.reverse());

      String s = "world";
      StringBuffer sbt = new StringBuffer(s);
      String reverser = new String(sbt.reverse());

      System.out.println(reverser);
  }
}
