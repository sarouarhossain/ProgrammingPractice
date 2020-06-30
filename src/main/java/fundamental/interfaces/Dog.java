package fundamental.interfaces;

public class Dog implements Animal {
  private int x = 4;

  @Override
  public void sound() {
    System.out.println("ghew ghew");
  }

  public void test1() {
    x++;
    System.out.println("test1");
  }

  private void age() {
    System.out.println("age : 5");
  }
}
