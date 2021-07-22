package com.eomcs.oop.ex00;

public class Calculator {

  int result = 0;

  static void plus(Calculator that, int value) { 
    that.result = that.result + value; // 들어온 값 누적해서 result 저장
  }

  static void minus(Calculator that, int value) {
    that.result = that.result - value;
  }

  static void multiple(Calculator that, int value) {
    that.result = that.result * value;
  }


}
