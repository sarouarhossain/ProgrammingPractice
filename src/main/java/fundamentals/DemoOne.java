package fundamentals;

public class DemoOne {
  String name;

  DemoOne(String name) {
    this.name = name;
  }

  public void test() {
    System.out.println(this.name);
  }

  public static void main(String[] args) {
    DemoOne demoOne1 = new DemoOne("Lee");
    DemoOne demoOne2 = new DemoOne("Ponting");

    demoOne2.test();
    demoOne1.test();
  }
}
