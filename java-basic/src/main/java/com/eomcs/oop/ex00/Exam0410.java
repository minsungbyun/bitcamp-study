package com.eomcs.oop.ex00;

public class Exam0410 {
  public static void main(String[] args) {

    // 1) 인스턴트 메서드 호출
    //    Test2.y1(); // 인스턴스 주소 없이 호출하면 문법오류!

    Test2 obj1 = new Test2();
    obj1.y1();

    Test2 obj2 = null;
    obj2.y1();

  }

}
