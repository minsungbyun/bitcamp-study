package com.eomcs.algorithm.data_structure.array;

public class MinArrayListTest {

  static MinArrayList minArrayList = new MinArrayList();

  public static void main(String[] args) {

    minArrayList.add("aaa");
    minArrayList.add("bbb");
    minArrayList.add("ccc");
    //    print();    

    //    Object old = minArrayList.remove(0);
    //    print();
    //    System.out.println(old);

    Object prevElement = minArrayList.set(0, "xxx");
    print();
    System.out.println(prevElement);


    System.out.println(minArrayList.get(2));

  }

  static void print() {
    for(int i = 0; i < minArrayList.size; i++) {
      String str = (String) minArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }

}
