package com.eomcs.design_pattern.decorator.ex01.before;

public class B extends A {
<<<<<<< HEAD
  // 기존 기능에 새 기능을 덧붙이기 위하여 오버라이딩을 이용한다.
  @Override
  public void f1(String name) {
    // 새 기능 추가
    // => 머리말을 출력하는 기능을 덧붙인다.
    System.out.println("[머리말]---------------");

    super.f1(name); // 기존 기능은 그대로 수행
  }
=======

  @Override
  public void f1(String name) {

    // 기존 기능에 새 기능을 덧붙이기 위하여 오버라이딩을 이용한다.
    // 머리말을 출력하는 기능을 덧붙인다.
    System.out.println("[머리말]------------");
    super.f1(name); // 기존 기능은 그대로 수행
  }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
}
