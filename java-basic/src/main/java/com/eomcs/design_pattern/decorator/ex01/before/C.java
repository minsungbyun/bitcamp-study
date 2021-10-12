package com.eomcs.design_pattern.decorator.ex01.before;

public class C extends B {

  @Override
  public void f1(String name) {

    super.f1(name);
    System.out.println("*****************************[끝]");
  }

}
