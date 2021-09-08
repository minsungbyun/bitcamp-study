// Stack Iterator과 Deque의 Iterator 차이점
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0210 {

  public static void main(String[] args) {


    ArrayDeque<String> stack = new ArrayDeque<>();

    // 다음과 같이 스택으로서 사용할 수 있다.
    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    // Stack 클래스와 다르게
    // Deque 구현체의 Iterator는 스택 방식(LIFO)으로 데이터를 꺼낸다.
    // 결론
    // Iterator 를 통해 데이터를 꺼낼 때 스택의 특성을 사용하고 싶다면
    // Stack 대신에 ArrayDeque를 사용한다.
    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // 여기서 잠깐!
    // 컬렉션의 데이터 조회방식 (LIFO, FIFO)에 상관없이
    // 일관된 방식으로 데이터를 조회할 수 있게 도와준다.
    // Stack처럼 입력 역순으로 꺼내든, 큐처럼 입력 순으로 꺼내든 상관없이
    // 개발자는 hasNext(), next()라는 동일한 메서드를


  }

}

