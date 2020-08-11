package TxtFileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class TextDataRead {
  public static void main(String[] args) {
    //
    Path filePath =
        Paths.get(
            "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\sample.txt");
    Charset charset = StandardCharsets.UTF_8;

    List<User> userList = new ArrayList<>();
    try {
      BufferedReader reader = Files.newBufferedReader(filePath, charset);
      String line;
      while ((line = reader.readLine()) != null) {
        line = line.trim().replaceAll("\\s{2,}", " ");
        String[] stringsOfLine = line.split(" ");

        if (stringsOfLine.length == 3) {
          if (isNumber(stringsOfLine[0])) {
            User user = new User();
            user.appId = stringsOfLine[0];
            user.name = stringsOfLine[1];
            String amount = stringsOfLine[2].replace(",", "");
            user.amount = Double.parseDouble(amount);

            userList.add(user);
          }
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    userList.forEach(
        user -> System.out.println(user.appId + "  " + user.name + "  " + user.amount));

    Map<String, Double> amountSumById = new HashMap<>();

    for (User user : userList) {
      if (amountSumById.containsKey(user.appId)) {
        Double amountSum = amountSumById.get(user.appId) + user.amount;
        amountSumById.replace(user.appId, amountSum);
      } else {
        amountSumById.put(user.appId, user.amount);
      }
    }

    System.out.println(amountSumById);
  }

  public static boolean isNumber(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
