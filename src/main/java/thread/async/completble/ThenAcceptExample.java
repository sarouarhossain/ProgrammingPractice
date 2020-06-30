package thread.async.completble;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptExample {
  public static void main(String[] args) {
    //
    CompletableFuture.supplyAsync(
            () -> {
              System.out.println("A: " + Thread.currentThread().getName());
              return "Ball";
            })
        .thenAcceptAsync(
            product -> {
              System.out.println("B: " + Thread.currentThread().getName());
              System.out.println("Got product detail from remote service " + product);
            });

    // thenRun() example
    CompletableFuture.supplyAsync(
            () -> {
              // Run some computation
              System.out.println("C:" + Thread.currentThread().getName());
              return "Test";
            })
        .thenRunAsync(
            () -> {
              // Computation Finished.
              System.out.println("D: " + Thread.currentThread().getName());
            });
  }
}
