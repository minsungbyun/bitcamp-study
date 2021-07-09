package com.eomcs.lang.ex05;

public class Exam0311 {
  public static void main(String[] args) {
    //    System.out.println(0 && 1); // 컴파일 오류
    //    System.out.println(0 || 1); // 컴파일 오류
    //    System.out.println(!0); // 컴파일 오류
    System.out.println(1 ^ 0);
    // ^ 연산자를 정수 값에 대해 사용하면
    // 비트 단위로 연산을 수행한다.
    //    00000000_00000000_000000000_00000010 (2)
    //    00000000_00000000_000000000_00000011 (3)
    //    -----------------------------------------
    //    00000000_00000000_000000000_00000001 (1)


  }
}
