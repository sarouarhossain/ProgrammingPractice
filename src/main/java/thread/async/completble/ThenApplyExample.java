package thread.async.completble;

import java.util.concurrent.*;

public class ThenApplyExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // thenApply() method to process and transform the result of a CompletableFuture when it arrives

    CompletableFuture<String> whatsYourNameFuture =
        CompletableFuture.supplyAsync(
            () -> {
              try {
                TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                throw new IllegalStateException(e);
              }
              System.out.println("AA: " + Thread.currentThread().getName());
              return "Rajeev";
            });

    // Attach a callback to the Future using thenApply()
    CompletableFuture<String> greetingFuture =
        whatsYourNameFuture.thenApply(
            name -> {
              System.out.println("BB: " + Thread.currentThread().getName());
              return "Hello " + name;
            });

    // Block and get the result of the future.
    System.out.println(greetingFuture.get()); // Hello Rajeev
  }

  public static Executor getExecutor() {
    return Executors.newFixedThreadPool(3);
  }
}
