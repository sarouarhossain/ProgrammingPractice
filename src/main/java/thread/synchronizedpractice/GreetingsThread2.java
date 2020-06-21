package thread.synchronizedpractice;

public class GreetingsThread2 extends Thread {
  private DisplayTwo display;
  private String name;

  GreetingsThread2(DisplayTwo display, String name) {
    super(name + " Thread");
    this.display = display;
    this.name = name;
  }

  @Override
  public void run() {
    display.greetings(name);
  }
}
