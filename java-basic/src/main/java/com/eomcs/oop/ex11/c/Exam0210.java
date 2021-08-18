// inner class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.c;

class B {
  // 클래스 멤버
  static int v1 = 10;
  static void m1() {}


  class X {

    void test() {
      // 같은 클래스 멤버 접근 가능
      System.out.println(B.v1);
      B.m1();
      System.out.println("-------------------------");


      // 중첩 클래스에서 바깥 클래스의 스태틱 멤버에 접근할 때는 
      // 같은 클래스 멤버이기 때문에 바깥 클래스 이름 생략할 수 있어 편하다.
      System.out.println(v1); 
      m1(); 
      System.out.println("-------------------------");
    }
  }

  public class Exam0210 {

    public static void main(String[] args) {

    }

  }

