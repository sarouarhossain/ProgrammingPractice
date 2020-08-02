package TxtFileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxtMain {
  public static void main(String[] args) {
    Path path =
        Paths.get(
            "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\data.txt");
    Charset charset = StandardCharsets.UTF_8;

    Map<String, Double> resultMap = getDebitCreditAmount(path, charset);

    System.out.println(
        "DebitAmount: " + resultMap.get("debit") + "   CreditAmount: " + resultMap.get("credit"));
  }

  public static Map<String, Double> getDebitCreditAmount(Path path, Charset charset) {
    List<Account> accountList = new ArrayList<>();

    try {
      BufferedReader bufferedReader = Files.newBufferedReader(path, charset);

      String line;
      boolean amountFound = false;
      boolean tcCodeFound = false;
      Double amount = 0.0;
      Integer tcCode = 0;
      while ((line = bufferedReader.readLine()) != null) {
        if (line.contains("AMOUNT:")) {
          amountFound = true;
          amount = convertLineToAmountData(line);
        } else if (line.contains("TC CODE:")) {
          tcCodeFound = true;
          tcCode = convertLineToTCCode(line);
        } else if (amountFound == true && tcCodeFound == true) {
          Account account = new Account();
          account.amount = amount;
          account.tcCodeType = tcCode;

          accountList.add(account);

          amountFound = false;
          tcCodeFound = false;
          amount = 0.0;
          tcCode = 0;
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    Double debitAmount = 0.0;
    Double creditAmount = 0.0;
    for (Account account : accountList) {

      if (account.tcCodeType == 2) {
        debitAmount += account.amount;
      } else if (account.tcCodeType == 7) {
        creditAmount += account.amount;
      }
    }

    Map<String, Double> map = new HashMap<>();
    map.put("credit", creditAmount);
    map.put("debit", debitAmount);
    return map;
  }

  public static Double convertLineToAmountData(String line) {
    String[] data = line.split(":");

    String dataAmount = data[1].replace(",", "");

    Double amount = Double.parseDouble(dataAmount);
    return amount;
  }

  public static Integer convertLineToTCCode(String line) {
    String[] data = line.split(":");

    String tcCode = data[1].replace(" ", "");

    Character lastDigit = tcCode.charAt(tcCode.length() - 1);

    return lastDigit - '0';
  }
}
