package thread.async.completble;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenCombineExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // thenCombine() is used when you want two Futures to run independently and do something after
    // both are complete.
    System.out.println("Retrieving weight.");
    CompletableFuture<Double> weightInKgFuture =
        CompletableFuture.supplyAsync(
            () -> {
              try {
                TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                throw new IllegalStateException(e);
              }
              System.out.println("A: " + Thread.currentThread().getName());
              return 65.0;
            });

    System.out.println("Retrieving height.");
    CompletableFuture<Double> heightInCmFuture =
        CompletableFuture.supplyAsync(
            () -> {
              try {
                TimeUnit.SECONDS.sleep(1);
              } catch (InterruptedException e) {
                throw new IllegalStateException(e);
              }
              System.out.println("B: " + Thread.currentThread().getName());
              return 177.8;
            });

    System.out.println("Calculating BMI.");
    CompletableFuture<Double> combinedFuture =
        weightInKgFuture.thenCombine(
            heightInCmFuture,
            (weightInKg, heightInCm) -> {
              System.out.println("C: " + Thread.currentThread().getName());
              Double heightInMeter = heightInCm / 100;
              return weightInKg / (heightInMeter * heightInMeter);
            });

    System.out.println("Your BMI is - " + combinedFuture.get());
  }
}
