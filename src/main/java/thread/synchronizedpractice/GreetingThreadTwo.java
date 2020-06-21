package thread.synchronizedpractice;

public class GreetingThreadTwo extends Thread {
  private Display display;
  private String name;

  GreetingThreadTwo(Display display, String name) {
    this.display = display;
    this.name = name;
  }

  @Override
  public void run() {
    display.test(name);
  }
}
