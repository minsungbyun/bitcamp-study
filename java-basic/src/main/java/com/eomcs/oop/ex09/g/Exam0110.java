// 인터페이스 활용: 스태틱 메서드의 활용
package com.eomcs.oop.ex09.g;

public class Exam0110 {
  public static void main(String[] args) {
    Tico c1 = new Tico(); //Car 객체이면서 CarCheckInfo 로 사용할 수 있는 객체이다.
    //Tico가 직접 CarCheckInfo를 구현한 것은 아니지만
    //Tico의 슈퍼클래스 AbstractCar가 CarCheckInfo를 구현해서 가능

    if (CarCheckInfo.validate(c1)) {
      c1.start();
      c1.run();
      c1.shutdown();
    } else {
      System.out.println("자동차를 점검하시기 바랍니다. 문제 발생!");
    }

  }
}
