// local class에서 바깥 메서드의 로컬 변수 접근
package com.eomcs.oop.ex11.d;

class D {

  void m1() {
<<<<<<< HEAD
=======
    // 인스턴스 메서드는 this에 C 인스턴스 주소를 저장하고 있다.

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    int a = 100;
    int b = 200;

    class X {
<<<<<<< HEAD
      // 로컬 클래스에서 바깥 메서드(m1())의 로컬 변수(a,b) 값을 사용한다면 
      // 1) 다음과 같이 컴파일 할 때 그 값을 저장할 필드(a)를 자동으로 추가한다.
      //    => 사용하는 변수에 대해서만 필드를 생성한다.
      //    => 로컬 변수 b는 사용하지 않기 때문에 b 값을 받을 필드는 생성하지 않는다.
      //      int a;
      //      D outer;
      // 
      // 2) 또한 로컬 클래스의 객체를 생성할 때 그 값을 사용할 수 있도록 
      //    생성자에 파라미터를 추가한다.
      //      public X(D outer, int a) {
      //        this.a = a;
      //        this.outer = outer;
      //      }
      // 
=======


      // 로컬 클래스에서 바깥 메서드(m1)의 로컬 변수(a,b)의 값을 사용한다면
      // 
      // 1) 다음과 같이 컴파일 할 때 그 값을 저장할 필드(a)를 자동으로 추가한다.
      // 사용하는 변수에 대해서만 필드를 생성한다.
      // 로컬 변수 b는 사용하지 않기 떄문에 만들어지지 않는다.
      // int a;
      // D outer;

      // 2) 또한 로컬 클래스의 객체를 생성할 때 그 값을 사용할 수 있도록 생성자에 파라미터를 추가한다.
      // public X(D outer, int a){
      //
      // }



>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      // .class 파일의 코드:
      //      class com.eomcs.oop.ex11.d.D$1X {
      //        
      //        final synthetic com.eomcs.oop.ex11.d.D this$0;
      //        
      //        private final synthetic int val$a;
      //        
      //        D$1X(com.eomcs.oop.ex11.d.D arg0, int arg1);
      //        ...
      //
<<<<<<< HEAD
      void f1() {
        // 그래서 다음과 같이 
        // 로컬 클래스에서는 바깥 메서드의 로컬 변수를 자기것인양 사용할 수 있는 것이다.
        System.out.println(a); // m1() 에 선언된 로컬 변수를 가리킨다.
      }
    }

    X obj = new X();
    obj.f1();
  }

  static void m2() {
    int a = 100;
    int b = 200;

    // 스태틱 메서드의 로컬 클래스도 인스턴스 메서드의 로컬 클래스와 같다.
    // 단, 스태틱이기 때문에 바깥 클래스의 인스턴스 주소를 받는 필드는 
    // 자동으로 생성되지 않는다.
    // 
    // .class 파일의 코드:
    //    class com.eomcs.oop.ex11.d.D$2X {
    //      
    //      private final synthetic int val$b;
    //      
    //      D$2X(int arg0);
    //      ..
=======
      //        int v3; <== 로컬 클래스의 인스턴스 필드
      //        final synthetic com.eomcs.oop.ex11.d.D this$0;  <== 바깥 클래스의 인스턴스 주소 저장
      //        private final synthetic int val$v2; <== 바깥 메서드의 로컬 변수 저장
      //
      void f1() {
        // 그래서 로컬 클래스에서는 바깥 메서드의 로컬 변수를
        // 자기것인양 사용 할 수 있다.
        System.out.println(a); // m1()에 선언된 로컬 변수를 가리킨다.
      }
    }

    X obj = new X();
    obj.f1();
  }
  static void m2() {

    int a = 100;
    int b = 200;



>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    class X {
      void f1() {
        System.out.println(b);
      }
    }

    X obj = new X();
    obj.f1();
  }
}

public class Exam0310 {

  public static void main(String[] args) {
    D obj = new D();
    obj.m1();
    obj.m2();
  }

}
