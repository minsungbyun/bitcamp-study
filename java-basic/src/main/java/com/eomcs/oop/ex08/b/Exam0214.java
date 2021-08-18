// 캡슐화(encapsulation) - 서브 클래스 접근 범위 테스트
package com.eomcs.oop.ex08.b;


public class Exam0214 extends com.eomcs.oop.ex08.b.sub.Y {

  public static void main(String[] args) {

    // 다른 패키지의 클래스를 그 클래스의 서브 클래스가 어디까지 접근할 수 있을까?
    Exam0214 obj = new Exam0214();
    //    obj.privateVar = 100; // 접근 불가! 오직 그 클래스 안에서만 사용가능.
    //    obj.defaultVar = 100; // OK! 이 클래스는 A 클래스와 같은 패키지에 소속되어 있다.
    obj.protectedVar = 100; // OK! 비록 이 클래스가 자식클래스는 아니지만
    //은 패키지에 소속되어 있다.
    obj.publicVar = 100; // OK! 모두 다 접근 가능!
  }
}

// private      : 클래스 안에서만 접근 가능
// (default)    : private + 같은 패키지 소속
// protected    : (default) + 서브 클래스로 만든 변수인 경우 서브 클래스에서 접근 가능
// public       : 모두 접근 가능





