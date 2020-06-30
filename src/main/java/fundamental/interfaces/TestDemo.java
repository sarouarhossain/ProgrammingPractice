package fundamental.interfaces;

import java.util.List;

public class TestDemo {
  public static void main(String[] args) {
    //
    Animal cat = new Cat();
    Animal dog = new Dog();

    cat.sound();
    dog.sound();

    Dog dog1 = new Dog();
    dog1.test1();
  }
}
