package com.eomcs.design_pattern.decorator.ex01.after;

public class B extends PlugIn {

  public B(Printer origin) {
    super(origin);
  }

  @Override
  public void f1(String name) {



    // 기존 기능에 새 기능을 덧붙이기 위하여 오버라이딩을 이용한다.
    // 머리말을 출력하는 기능을 덧붙인다.
    System.out.println("[머리말]------------");
    origin.f1(name); // 기존 기능은 그대로 수행
  }

}
