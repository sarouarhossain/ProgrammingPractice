package fundamental.interfaces;

public abstract class Parent {
  public void test1() {
    System.out.println("test1");
  }

  abstract void test();

  public static void main(String[] args) {
    System.out.println(Parent.class);
  }
}
