package fundamental.students;

import java.util.Objects;

public class Student {
  String name;
  int roll;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student st = (Student) o;
    if (this.name.equals(st.name) && this.roll == st.roll) {
      return true;
    }

    return false;
  }

  public Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRoll() {
    return roll;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }
}
