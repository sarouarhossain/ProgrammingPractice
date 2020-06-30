package fundamental.polymorphism;

public class Dog extends Animal {
  Dog() {
    super(4, "bone");
  }

  public void sound() {
    System.out.println(" ghew ghew ");
  }

  public void testDog() {
    System.out.println("dog test");
  }
}
