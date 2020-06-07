package stringtest;

public class TestClass {
    private int i;
    private String name = "jack";

    TestClass(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public TestClass modify(int i) {
        if(this.i == i){
            return this;
        }else{
            return new TestClass(i);
        }
    }

  public static void main(String[] args) {
    TestClass testClass = new TestClass(5);

    //TestClass testClass1 = testClass.modify(8);

    TestClass x = testClass.modify(5);

    System.out.println(testClass == x);
  }
}
