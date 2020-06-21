package EnumTest;

public enum CurrencySign {
  DOLLAR("$", "USA"),
  YEN("¥", "JAPAN"),
  POUND("£", "BRITAIN"),
  EURO("€", "GERMANY");
  private String sign;
  private String country;

  CurrencySign(String sign, String country) {
    this.sign = sign;
    this.country = country;
  }

  //  public String toString() {
  //    return this.sign + " " + this.country;
  //  }

  public static CurrencySign getCurrencyByCountry(String country) throws Exception {
    for (CurrencySign sign : CurrencySign.values()) {
      if (sign.country.equals(country)) {
        return sign;
      }
    }
    throw new Exception("Invalid country");
  }
}
