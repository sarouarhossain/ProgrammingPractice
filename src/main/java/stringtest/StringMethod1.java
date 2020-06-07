package stringtest;

public class StringMethod1 {
  public static void main(String[] args) {
    //
      String s = "life is beautiful";
    // System.out.println(  s.contains("isa"));
    // System.out.println(s.indexOf('i'));

    // System.out.println(s.indexOf("i",6));

    // System.out.println(s.substring(5,9));
      String x = s.replace(" ","_");
    System.out.println(x);
    System.out.println(s);

    Double dt = 20.0;
    Integer in = 20;

    String xt = dt.toString();
  }
}
