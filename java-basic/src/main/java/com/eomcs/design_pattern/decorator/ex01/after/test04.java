package com.eomcs.design_pattern.decorator.ex01.after;

public class test04 {
  public static void main(String[] args) {

    // 1) 실제 작업을 할 객체를 준비한다.
    A a = new A();

    // 2) 머리말 기능을 빼고 싶으면 언제든 뺄 수 있다.
    //    B b  = new B(a);    


    C c = new C(a);
    c.f1("홍길동");
  }
}
