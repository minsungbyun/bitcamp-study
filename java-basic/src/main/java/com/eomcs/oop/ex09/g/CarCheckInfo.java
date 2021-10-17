package com.eomcs.oop.ex09.g;

// 이 인터페이스의 용도
// - 자동차를
public interface CarCheckInfo {
  int getGas();
  int getBrakeOil();
  int getEngineOil();

  // 인터페이스에서 스태틱 메서드는 보통 
  // 그 인터페이스를 구현한 객체를 다루는 일을 한다.
  static boolean validate(CarCheckInfo carInfo) { // 규칙을 다루는 스태틱 메서드가 필요한 경우
    if (carInfo.getBrakeOil() == 0 ||
        carInfo.getEngineOil() == 0 ||
        carInfo.getGas() == 0) {
      return false;
    }
    return true;
  }

}
