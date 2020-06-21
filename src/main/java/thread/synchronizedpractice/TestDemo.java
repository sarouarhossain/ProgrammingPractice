package thread.synchronizedpractice;

public class TestDemo {
  public static void main(String[] args) {
    //
    Display display = new Display();
    GreetingsThread t1 = new GreetingsThread(display, "Lee");
    GreetingsThread t2 = new GreetingsThread(display, "Ponting");
    GreetingsThread t3 = new GreetingsThread(display, "Heyden");
    GreetingsThread t4 = new GreetingsThread(display, "Warne");

    GreetingThreadTwo t5 = new GreetingThreadTwo(display, "Saymonds");
    GreetingThreadTwo t6 = new GreetingThreadTwo(display, "Gilchrist");
    GreetingThreadTwo t7 = new GreetingThreadTwo(display, "Macgrath");
    GreetingThreadTwo t8 = new GreetingThreadTwo(display, "Gillespi");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
  }
}
