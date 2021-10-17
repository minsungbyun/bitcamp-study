// 디폴트 메서드 - 기존 코드에 영향을 미치지 않고 새 규칙을 추가하는 방법
package com.eomcs.oop.ex09.h;

public interface Printer {

  // 일반적으로 선언하는 인터페이스의 메서드는 public abstract 이다.
  // 따라서 이 인터페이스를 구현하는 모든 클래스는 반드시 이 메서드를 정의해야 한다.
  void print(String text);

  // 다음과 같이 새 기능을 무심코 추가한다면
  // 기존에 이 인터페이스에 규칙에 따라 작성한 모든 클래스들에
  // 컴파일 오류가 발생할 것이다.
  // 왜? 새 규칙(메서드)이 추가되었기 때문이다.
  // 새 규칙이 추가되었으면 기존 클래스들도 새 규칙을 구현해야 한다.
  //
<<<<<<< HEAD:java-basic/src/main/java/com/eomcs/oop/ex09/h/Printer.java
  // 그래서 기존 인터페이스를 변경하는 것은 매우 위험도가 크다.
  // 해결책?
  // => 방법1) 이 인터페이스를 상속 받아서 새 인터페이스를 만든다.
  // => 방법2) 이 인터페이스에 새 규칙을 추가하되 default 문법을 사용하여 미리 구현한다.
  //
=======
  // 기존 인터페이스를 변경하는 것은 매우 위험도가 크다.
  // 해결책 ? 
  // 이 인터페이스를 상속 받아서 새 인터페이스를 만든다.
  // 이 인터페이스에 새 규칙을 추가하되 default문법을 사용하여 미리 구현한다.
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e:java-basic/src/main/java/com/eomcs/oop/ex09/i/Printer.java
  //  void watermark(String title);

  // 디폴트 메서드를 사용하면 기존 구현체(인터페이스를 구현한 클래스)에 영향을 끼지지 않으면서
  // 새 규칙을 추가할 수 있다.
  // => 디폴트 메서드를 추가할 때 간단하게 코드를 작성할 수 있지만,
  //    클래스처럼 뭔가 진짜 일을 하는 코드를 작성하는 것은 좋지 않다.
  //    그냥 다음과 같이 빈 메서드를 만들라!
  //
  default void watermark(String title) {};
<<<<<<< HEAD:java-basic/src/main/java/com/eomcs/oop/ex09/h/Printer.java
  //
=======

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e:java-basic/src/main/java/com/eomcs/oop/ex09/i/Printer.java
  // 이 메서드를 추가했다고 해서
  // 기존에 작성한 클래스(PaterPrinter, FilmPrinter)를 변경할 필요는 없다.
  // 컴파일 오류가 발생하지 않는다.
  //
  // 그러나 default 문법을 사용했을 때 단점이 있다.
  // => 구현할 클래스에게 메서드 구현을 강제할 수 없다!!! 
}








