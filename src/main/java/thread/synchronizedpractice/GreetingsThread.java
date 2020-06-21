package thread.synchronizedpractice;

public class GreetingsThread extends Thread {
  public Display display;
  public String name;

  GreetingsThread(Display display, String name) {
    this.display = display;
    this.name = name;
  }

  @Override
  public void run() {
    display.greetings(name);
  }
}
