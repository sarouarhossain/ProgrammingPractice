package thread.async.completble;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunAsyncExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // if we dont want to return anything from the task , we can use runAsync
    CompletableFuture<Void> future =
        CompletableFuture.runAsync(
            () -> {
              // Simulate a long-running Job
              try {
                TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                throw new IllegalStateException(e);
              }
              System.out.println("I'll run in a separate thread than the main thread.");
              System.out.println(Thread.currentThread().getName());
            });

    // Block and wait for the future to complete
    future.get();
  }
}
