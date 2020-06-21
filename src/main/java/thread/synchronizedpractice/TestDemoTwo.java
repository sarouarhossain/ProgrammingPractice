package thread.synchronizedpractice;

import java.time.Duration;
import java.time.LocalDateTime;

public class TestDemoTwo {
  public static void main(String[] args) throws InterruptedException {
    DisplayTwo display = new DisplayTwo();

    GreetingsThread2 t1 = new GreetingsThread2(display, "Lee");
    GreetingsThread2 t2 = new GreetingsThread2(display, "Ponting");
    GreetingsThread2 t3 = new GreetingsThread2(display, "Heyden");
    GreetingsThread2 t4 = new GreetingsThread2(display, "Warne");

    LocalDateTime startTime = LocalDateTime.now();

    t1.start();
    t2.start();
    t3.start();
    t4.start();

    t1.join();
    t2.join();
    t3.join();
    t4.join();

    LocalDateTime endTime = LocalDateTime.now();

    System.out.println("Time diff: " + Duration.between(startTime, endTime));
  }
}
