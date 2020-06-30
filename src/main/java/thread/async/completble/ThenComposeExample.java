package thread.async.completble;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenComposeExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // Combine two dependent futures using thenCompose
    String userId = "2";

    CompletableFuture<String> result =
        getUsersDetail(userId)
            .thenComposeAsync(
                us -> {
                  System.out.println("C: " + Thread.currentThread().getName());
                  return getCreditRating(us);
                });

    System.out.println(result.get());
    // So, Rule of thumb here - If your callback function returns a CompletableFuture, and you want
    // a flattened result from the CompletableFuture chain (which in most cases you would), then use
    // thenCompose().
  }

  static CompletableFuture<String> getUsersDetail(String userId) {
    return CompletableFuture.supplyAsync(
        () -> {
          System.out.println("A: " + Thread.currentThread().getName());
          // return UserService.getUserDetails(userId);
          return userId + "1234";
        });
  }

  static CompletableFuture<String> getCreditRating(String user) {
    return CompletableFuture.supplyAsync(
        () -> {
          System.out.println("B: " + Thread.currentThread().getName());
          // return CreditRatingService.getCreditRating(user);
          return user + "987";
        });
  }
}
