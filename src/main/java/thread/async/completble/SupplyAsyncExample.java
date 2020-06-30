package thread.async.completble;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class SupplyAsyncExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // If we want to return something from the task
    // Run a task specified by a Supplier object asynchronously
    CompletableFuture<String> future =
        CompletableFuture.supplyAsync(
            () -> {
              try {
                TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                throw new IllegalStateException(e);
              }
              System.out.println(Thread.currentThread().getName());
              return "Result of the asynchronous computation";
            },
            getExecutor());

    // Block and get the result of the Future
    String result = future.get();
    System.out.println(result);
  }

  public static Executor getExecutor() {
    return Executors.newFixedThreadPool(3);
  }
}
