package com.eomcs.oop.ex00;

import com.eomcs.oop.ex00.util.Calculator;

public class Exam0500 {

  public static void main(String[] args) {
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c2.plus(2);

    c1.plus(3);
    c2.plus(3);

    c1.minus(1);
    c2.minus(1);

    c1.multiple(7);
    c2.multiple(7);

    c1.divide(3);
    c2.divide(3);

    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);
  }

}
