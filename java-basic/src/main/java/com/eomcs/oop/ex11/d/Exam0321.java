<<<<<<< HEAD
// local class에서 바깥 메서드의 로컬 변수 접근 I
package com.eomcs.oop.ex11.d;

class D2 { 
  int v1 = 1;

  void m1() {
=======
// local class에서 바깥 메서드의 로컬 변수 접근
package com.eomcs.oop.ex11.d;

class D44 {
  int v1 = 1;

  void m1() {
    // 인스턴스 메서드는 this에 C 인스턴스 주소를 저장하고 있다.
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    int v2 = 2;

    class X {
      int v3 = 3;

      void f() {
        int v4 = 4;
<<<<<<< HEAD
        System.out.printf("v4 = %d\n", v4); // f()의 로컬 변수
        System.out.printf("v3 = %d\n", this.v3); // X 인스턴스의 변수
        System.out.printf("v1 = %d\n", D2.this.v1); // D2의 인스턴스 변수

        // 바깥 메서드의 로컬 변수를 사용할 때는 
        // 자신의 메서드인양 사용하면 된다.
        System.out.printf("v2 = %d\n", v2); // D2.m1()의 로컬 변수
=======
        System.out.printf("v4 = %d\n", v4);
        System.out.printf("v3 = %d\n", this.v3);
        System.out.printf("v1 = %d\n", D44.this.v1);

        // 바깥 메서드의 로컬 변수를 자기 것인 양 사용할 수 있다.
        System.out.printf("v2 = %d\n", v2);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      }
    }

    X obj = new X();
    obj.f();
  }
}

public class Exam0321 {

  public static void main(String[] args) {
<<<<<<< HEAD
    D2 obj = new D2();
=======
    D44 obj = new D44();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    obj.m1();
  }

}
