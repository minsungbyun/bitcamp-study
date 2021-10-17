<<<<<<< HEAD
// local class에서 바깥 메서드의 로컬 변수 접근 II
=======
// 인스턴스 메서드에 정의된 local class : 변수를 찾는 순서
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
package com.eomcs.oop.ex11.d;

class D22 {
  int v1 = 1;

  void m1() {
    //    int v1 = 10;

    class X {
      //      int v1 = 100;

      void f() {
<<<<<<< HEAD
        //        int v1 = 1000;
=======
        //int v1 = 1000;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
        System.out.printf("v1 = %d\n", v1);
        // this 를 생략하면 다음 순서로 변수를 찾는다.
        // 1) 로컬 변수
        // 2) 인스턴스 변수
<<<<<<< HEAD
        // 3) 메서드에 선언된 로컬 변수
=======
        // 3) 메서드의 선언된 로컬 변수
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
        // 4) 바깥 클래스의 인스턴스 변수 또는 스태틱 변수
      }
    }

    X obj = new X();
    obj.f();
  }
}

public class Exam0322 {

  public static void main(String[] args) {
    D22 obj = new D22();
    obj.m1();
  }

}
