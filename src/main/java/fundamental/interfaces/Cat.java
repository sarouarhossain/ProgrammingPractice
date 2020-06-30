package fundamental.interfaces;

public class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println("mew mew");
  }

  private void age() {
    System.out.println("age : 2");
  }
}
