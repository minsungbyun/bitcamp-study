<<<<<<< HEAD
// anonymous class : 클래스를 상속 받은 익명 클래스 정의
=======
// anonymous class : 인터페이스를 구현한 익명 클래스 정의
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
package com.eomcs.oop.ex11.e;

public class Exam0120 {

  // 클래스는 static과 non-static이 구분된다.
  static abstract class A {
    abstract void print();
  }

  public static void main(final String[] args) {
    // 1) 로컬 클래스로 서브 클래스 만들기
    class My extends A {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    }

    A obj = new My();
    obj.print();
<<<<<<< HEAD
=======


>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}
