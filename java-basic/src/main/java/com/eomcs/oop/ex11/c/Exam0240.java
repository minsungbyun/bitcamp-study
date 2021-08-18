// inner class : 바깥 클래스의 인스턴스 멤버 접근하기
package com.eomcs.oop.ex11.c;

class B4 {

  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v2 = 100;

    void test() {

      int v3 = 2000;


      // 변수를 찾을 때
      // 1. 로컬 변수
      // 2. 인스턴스  변수
      // 3. 바깥 객체의 인스턴스 변수
      System.out.printf("v3 = %d\n",v3); // 로컬 변수 : v3
      System.out.printf("this.v2 = %d\n",v2); // 인스턴스 변수 : this.v2
      System.out.printf("B4.this.v1 = %d\n",v1); // 바깥 객체의 인스턴스 변수 : B4.this.v1

    }
  }
}

public class Exam0240 {

  public static void main(String[] args) {
    B4 outer = new B4();
    outer.v1 = 11;
    B4.X x1 = outer.new X();
    x1.test();

    System.out.println("------------");

    B4.X x2 = outer.new X();
    outer.v1 = 22;
    x2.test();

    System.out.println("------------");

    B4.X x3 = outer.new X();
    outer.v1 = 33;
    x3.test();
  }

}
