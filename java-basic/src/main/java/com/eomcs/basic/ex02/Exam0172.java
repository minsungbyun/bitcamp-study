// String - 기타 메서드 : Arrays.copyOfRange()
package com.eomcs.basic.ex02;

import java.util.Arrays;

public class Exam0172 {
  public static void main(String[] args) {

<<<<<<< HEAD
    String[] arr = {"101", "제목", "내용", "4", "2021-2-2"};

    // 배열에서 특정 범위의 항목을 복사하기
    String[] arr2 = Arrays.copyOfRange(arr, 2, 4);
=======
    String[] arr = {"101","제목","내용","4","2020-2-2"};

    String[] arr2 = Arrays.copyOfRange(arr,2,4);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    for (String s : arr2) {
      System.out.println(s);
    }

<<<<<<< HEAD
=======
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }







>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}


