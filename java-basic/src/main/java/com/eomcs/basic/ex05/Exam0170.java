// Stack 클래스 사용법 - Iterator 사용
package com.eomcs.basic.ex05;

import java.util.Stack;

public class Exam0170 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");



    // Stack도 Iterable 구현체이기 떄문에 다음과 같이 for ( : ) 문을 사용할 수 있다.
    // 내부적으로는 Iterator()를 호출하여 Iterator를 얻은 후에
    // 이 Iterator를 통해 값을 꺼낸다.
    // EXam0160과 같다.
    for (String s : stack) {
      System.out.println(s);
    }



  }

}

