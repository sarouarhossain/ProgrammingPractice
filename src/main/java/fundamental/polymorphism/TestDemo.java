package fundamental.polymorphism;

public class TestDemo {
  public static void main(String[] args) {
    //
    Animal animal1;
    Animal animal2;

    animal1 = new Cat(); // object creation happens in runtime
    animal2 =
        new Dog(); // we dont know what is the animal2 in compile time, it may be cat, may be dog

    animal1.sound();
    //    animal1.testCat();

    animal2.sound();
    //    animal2.testDog();

    // javac classname -> time compile time -> bytecode generate
    // java bytecode -> runtime -> JVM bytecode ke input hisabe niye run korbe
  }
}
