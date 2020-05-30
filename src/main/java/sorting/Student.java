package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    public String name;
    public Integer roll;
    public Float height;
    public Integer age;

    public Student(String name, Integer roll, Float height, Integer age){
        this.name = name;
        this.roll = roll;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name+", roll: "+roll+" height: "+height+" age:"+age;
    }

    public static void main(String[] args) {
    //
      Student student1 = new Student("Tom",3,5.8f,21);
      Student student2 = new Student("Jerry",1,5.7f,20);
      Student student3 = new Student("Jack",2,5.9f,22);
      Student student4 = new Student("Donald",5,5.3f,21);
      Student student5 = new Student("Peaky",4,5.5f,21);

      List<Student> studentList = new ArrayList<>();
      studentList.add(student1);
      studentList.add(student2);
      studentList.add(student3);
      studentList.add(student4);
      studentList.add(student5);

    System.out.println("Before:");
    studentList.forEach(student -> System.out.println(student.toString()));
//        for (Student student: studentList){
//            System.out.println(student.toString());
//        }

    selectionSort(studentList);
       //studentList.sort(Comparator.comparing(student -> student.roll));

    System.out.println("After: ");
    studentList.forEach(student -> System.out.println(student.toString()));
  }

    public static void selectionSort(List<Student> studentList){
        int n = studentList.size();
        for (int i = 0; i<n-1;i++){
            int k = i;
            for (int j = k+1; j<= n-1; j++){
                if(studentList.get(k).roll>studentList.get(j).roll){
                    k = j;
                }
            }

            //int temp = A[i];
            //A[i] = A[k];
            //A[k] = temp;
            Student temp = studentList.get(i);
            studentList.set(i,studentList.get(k));
            studentList.set(k,temp);
        }
    }
}
