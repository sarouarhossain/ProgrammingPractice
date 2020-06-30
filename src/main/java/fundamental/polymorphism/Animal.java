package fundamental.polymorphism;

public class Animal {
  int legs;
  String fvrtFood;

  Animal(int legs, String fvrtFood) {
    this.legs = legs;
    this.fvrtFood = fvrtFood;
  }

  public void sound() {
    System.out.println(" animal sound ");
  }
}
