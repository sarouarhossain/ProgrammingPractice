package TxtFileRead;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class TxtMain {
  public static final String XLSX_PATH =
      "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\testdata.xlsx";

  public static void main(String[] args) throws IOException, InvalidFormatException {
    Path path =
        Paths.get(
            "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\data.txt");

    Charset charset = StandardCharsets.UTF_8;

    Map<String, Double> resultMap = getDebitCreditAmount(path, charset);

    System.out.println(
        "DebitAmount: " + resultMap.get("debit") + "   CreditAmount: " + resultMap.get("credit"));

    writeToExcelSheet(resultMap.get("debit"), resultMap.get("credit"));
  }

  public static void writeToExcelSheet(Double debit, Double credit)
      throws IOException, InvalidFormatException {

    FileInputStream file =
        new FileInputStream(
            "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\testdata.xlsx");

    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheet("0803");

    boolean isDataWritten = false;
    for (Row row : sheet) {
      for (Cell cell : row) {
        if (cell.getCellTypeEnum().equals(CellType.STRING)
            && cell.getStringCellValue().equals("EPN Fed Credits Presented")) {
          row.createCell(5).setCellValue(debit);
          row.createCell(12).setCellValue(credit);
          isDataWritten = true;
          break;
        }
      }

      if (isDataWritten) break;

      //      Cell cell = row.getCell(0);
      //      System.out.println(cell.getStringCellValue());
      //      if (cell.getStringCellValue().equals("EPN Fed Debits Presented")) {
      //        row.createCell(5).setCellValue(debit);
      //        row.createCell(12).setCellValue(credit);
      //        break;
      //      }
    }

    //    Cell cell = null;
    //
    //    // column: 7, 13, row 7
    //    cell = sheet.getRow(6).createCell(5);
    //    cell.setCellValue(debit);
    //
    //    cell = sheet.getRow(6).createCell(12);
    //    cell.setCellValue(credit);

    file.close();

    Date date = new Date();
    FileOutputStream outputStream =
        new FileOutputStream(
            "C:\\Users\\sarou\\Desktop\\ProgrammingPractice\\ProgrammingPractice\\src\\main\\resources\\testdata_update"
                + date.getTime()
                + ".xlsx");

    workbook.write(outputStream);
    outputStream.close();
    workbook.close();
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
