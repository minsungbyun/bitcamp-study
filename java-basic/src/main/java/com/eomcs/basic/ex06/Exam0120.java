<<<<<<< HEAD
// Queue 구현과 사용 : for(:)
=======
// Queue 구현과 사용
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
package com.eomcs.basic.ex06;

import java.util.concurrent.ArrayBlockingQueue;

public class Exam0120 {

  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

<<<<<<< HEAD
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
    queue.offer(s1); // aaa,
    queue.offer(s2); // aaa, bbb,
    queue.offer(s3); // aaa, bbb, ccc,
    queue.offer(s4); // aaa, bbb, ccc, ddd,
    queue.offer(s5); // aaa, bbb, ccc, ddd, eee,
=======
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
    queue.offer(s1); // aaa,
    queue.offer(s2); // aaa, bbb,
    queue.offer(s3); // aaa, bbb, ccc,
    queue.offer(s4); //aaa, bbb, ccc,ddd
    queue.offer(s5); //aaa, bbb, ccc,ddd, eee
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    for (String s : queue) {
      System.out.println(s);
    }
  }
}





















