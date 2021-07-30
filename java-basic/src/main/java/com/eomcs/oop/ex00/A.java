package com.eomcs.oop.ex00;

public class A {

  int c;

  public static void main(String[] args) {

    A a  = new A();
    A b  = new A();
    b.c = 333;
    System.out.println("a.c = "+b.c);
    b(a);

  }

  static void b(A anything) {
    System.out.println("anything.c = "+anything.c);
  }

}
