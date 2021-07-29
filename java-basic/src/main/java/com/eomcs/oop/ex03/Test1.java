package com.eomcs.oop.ex03;

public class Test1 {

  int result;
  static int result2;

  public static void main(String[] args) {
    Test1 test = new Test1();
    instanceMethod(test);


  }

  static void instanceMethod(Test1 test) {
    test.result = 10;
    System.out.println(test.result);
    result2 = 2;
    System.out.println(result2);

  }

}
