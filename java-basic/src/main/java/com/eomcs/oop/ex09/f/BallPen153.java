package com.eomcs.oop.ex09.f;

<<<<<<< HEAD
// 다음 클래스를 말로 설명한다면?
// - BallPen153 의 기본 기능은 Monami 에서 받고
//   Pen 규칙에 따라 동작하도록 만든다.
=======

//다음 클래스를 말로 설명한다면?
// -ballpen153은 모나미에서 기본 기능 받고
// -pen 규칙에 따라 동작하도록 만든다.
// 
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
public class BallPen153 extends Monami implements Pen {
  @Override
  public void write(String text) {
    if (!this.use)
      return;
    System.out.println("모나미 ** " + text + " **");
  }
}
