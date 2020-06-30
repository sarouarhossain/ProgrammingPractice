package fundamental.polymorphism;

public class Cat extends Animal {
  Cat() {
    super(4, "fish");
  }

  public void sound() {
    System.out.println(" mew mew ");
  }

  public void testCat() {
    System.out.println("cat test ");
  }
}
