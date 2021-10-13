package com.eomcs.design_pattern.decorator.ex01.after;

public class C extends PlugIn {

<<<<<<< HEAD
  // C 클래스가 기능을 덧붙여야 하는 대상이 되는 객체를 생성자로 받는다.
=======

  // C 클래스가 기능을 덧붙여야 하는 대상을 생성자로 받는다.
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  public C(Printer origin) {
    super(origin);
  }

  @Override
  public void f1(String name) {

<<<<<<< HEAD
    // 생성자에서 받은 객체에 대해 먼저 기능을 실행한다.
    origin.f1(name);

    // 새 기능을 덧붙인다.
    // => 꼬리말을 출력한다.
    System.out.println("********************[끝]");
  }
=======
    origin.f1(name); // 생성자에서 받은 객체에 대해 먼저 기능을 실행한다.
    System.out.println("*****************************[끝]");
  }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
}
