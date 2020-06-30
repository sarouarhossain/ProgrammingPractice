package thread.async.completble;

import java.util.concurrent.*;

public class ThenApplyExampleTwo {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //
    Executor executor = Executors.newFixedThreadPool(3);
    CompletableFuture<String> welcomeText =
        CompletableFuture.supplyAsync(
                () -> {
                  try {
                    TimeUnit.SECONDS.sleep(1);
                  } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                  }
                  System.out.println("A:" + Thread.currentThread().getName());
                  return "Rajeev";
                },
                executor)
            .thenApplyAsync(
                name -> {
                  System.out.println("B:" + Thread.currentThread().getName());
                  return "Hello " + name;
                },
                executor)
            .thenApplyAsync(
                greeting -> {
                  System.out.println("C:" + Thread.currentThread().getName());
                  return greeting + ", Welcome to the CalliCoder Blog";
                },
                executor);

    System.out.println(welcomeText.get());
  }
}
