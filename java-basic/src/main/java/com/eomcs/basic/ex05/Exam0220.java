// Deque와 Iterator
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;

public class Exam0220 {

  public static void main(String[] args) {

    // Deque 인터페이스
    // Double ended queue의 약자이다
    // 즉 앞, 뒤 모두 양방향에서 값을 넣고 꺼낼 수 있다.
    // 그래서 큐로도 사용할 수 있고 스택으로도 사용할 수 있다.
    //  queue와 stack 사용법을 모두 정의한 인터페이스이다.


    ArrayDeque<String> stack = new ArrayDeque<>();

    // 다음과 같이 스택으로서 사용할 수 있다.
    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }





  }

}

