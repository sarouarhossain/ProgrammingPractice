package fundamental.students;

public class Test {
  public static void main(String[] args) {
    //
    Student student = new Student("Lee", 1);
    Student student1 = new Student("Lee", 1);
    Student student4 = new Student("Lee", 2);

    Student student2 = new Student("Ponting", 4);

    System.out.println(student.equals(student4));

    // System.out.println(student.equals(student1));
  }
}
