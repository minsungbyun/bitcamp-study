package com.eomcs.design_pattern.decorator.ex01.after;

public class C extends PlugIn {


  // C 클래스가 기능을 덧붙여야 하는 대상을 생성자로 받는다.
  public C(Printer origin) {
    super(origin);
  }

  @Override
  public void f1(String name) {

    origin.f1(name); // 생성자에서 받은 객체에 대해 먼저 기능을 실행한다.
    System.out.println("*****************************[끝]");
  }

}
