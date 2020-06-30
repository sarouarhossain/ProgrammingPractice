package array.ListImplementation;

public class MyList<T> {
  private T[] dataArray = (T[]) new Object[5]; // dataArray = 11
  private int index = 0; // 5

  public void add(T data) {
    if (index == dataArray.length) {
      int currentArraySize = dataArray.length;
      int newArraySize = currentArraySize * 2 + 1;

      T[] newArray = (T[]) new Object[newArraySize];

      for (int i = 0; i < currentArraySize; i++) {
        newArray[i] = dataArray[i];
      }

      dataArray = newArray;
      dataArray[index++] = data;

    } else {
      dataArray[index++] = data;
    }
  }

  public int size() {
    return this.index;
  }

  public void displayList() {
    for (int i = 0; i < index; i++) {
      System.out.print(dataArray[i] + " ");
    }
    System.out.println();
  }

  public void remove(T data) {
    int x = getIndex(data);

    if (x >= 0) {
      for (int i = x; i < index; i++) {
        dataArray[i] = dataArray[i + 1];
      }

      index--;
    }
  }

  /**
   * get index of data. if data not found return -1
   *
   * @param data
   * @return
   */
  private int getIndex(T data) {
    for (int i = 0; i < index; i++) {
      if (dataArray[i].equals(data)) return i;
    }

    return -1;
  }
}
