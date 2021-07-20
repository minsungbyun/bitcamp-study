package com.eomcs.oop.ex00;

public class Exam0200 {
  public static void main(String[] args) {
    // 인스턴스 변수 테스트

    Test t1 = new Test();
    test1(t1);
    System.out.println(t1.b);

    Test t2 = new Test();
    test1(t2);
    System.out.println(t1.b);


  }

  static void test1(Test p) {
    p.b = 3000;
  }
}
