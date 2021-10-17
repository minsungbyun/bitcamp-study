// local class에서 바깥 메서드의 로컬 변수 접근
package com.eomcs.oop.ex11.d;

class D44 {
  int v1 = 1;

  void m1() {
    // 인스턴스 메서드는 this에 C 인스턴스 주소를 저장하고 있다.
    int v2 = 2;

    class X {
      int v3 = 3;

      void f() {
        int v4 = 4;
        System.out.printf("v4 = %d\n", v4);
        System.out.printf("v3 = %d\n", this.v3);
        System.out.printf("v1 = %d\n", D44.this.v1);

        // 바깥 메서드의 로컬 변수를 자기 것인 양 사용할 수 있다.
        System.out.printf("v2 = %d\n", v2);
      }
    }

    X obj = new X();
    obj.f();
  }
}

public class Exam0321 {

  public static void main(String[] args) {
    D44 obj = new D44();
    obj.m1();
  }

}
