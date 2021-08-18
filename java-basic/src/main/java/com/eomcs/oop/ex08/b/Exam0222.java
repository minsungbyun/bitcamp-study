// 캡슐화(encapsulation) 응용 - 생성자를 private 으로 막기 2
package com.eomcs.oop.ex08.b;


class Car2 {
  String model;
  String maker;
  int cc;
  int valve;

  static class CarFactory {


    // 생성자를 private으로 선언하면 외부에서 직접 인스턴스를 생성하는 것을 막을 수 있다. 
    private CarFactory() {


    }

    static CarFactory factory = null;
    public static CarFactory getInstance() {
      if (factory == null) {
        factory = new CarFactory();
      }

      return factory;


    }

    //
    // 예2) 인스턴스롤 오직 한 개만 생성해야 할 경우
    //        - 인스턴스를 여러 개 생성 할 필요 없는 경우에 생성자를 private로 막는다.
    //          - getInstance() 같은 스태틱 메서드를 통해 인스턴스를 한 개만 만들어 사용한다.
    //          - 이런 설계 기법을 singleton 이라 한다.

    public Car2 create(String name) {

      Car2 c = new Car2(); // private은 클래스 안에서 사용할 수 있다.

      switch (name) {
        case "티코":
          c.model = "티코";
          c.maker = "대우";
          c.cc = 800;
          c.valve = 16;
          break;
        case "소나타":
          c.model = "소나타";
          c.maker = "현대자동차";
          c.cc = 1980;
          c.valve = 16;
          break;
        default:
          c.model = "모델S";
          c.maker = "테슬라";
          c.cc = 0;
          c.valve = 0;
      }
      return c;
    }
  }

  public class Exam0222 {

    public static void main(String[] args) {

      //    Car c1 = new Car(); // 컴파일 오류!
      // 생성자가 private이기 때문에 다른 클래스에서 호출할 수 없다.
      // 따라서 인스턴스를 생성할 수 없다.
      //
      // 그럼 왜 생성자를 private으로 만들었는가?
      // => 개발자가 직접 인스턴스를 생성하면 너무 복잡하니,
      //    다른 메서드를 통해 인스턴스를 생성하라는 의미다!
      //
      //      CarFactory factory = new CarFactory(); // 컴파일 오류 왜 ? 생성자가 private이다.

      //      CarFactory factory = CarFactory.getInstance(); 


      Car c = Car.create("티코");

      System.out.printf("%s,%s,%d,%d\n",
          c.model, c.maker, c.cc, c.valve);

      //      Exam0221 이나
      //      예1) Car c2 = Car.create("티코"); 보통 스태틱 메서드이다.
      //
      //      Exam0222의 경우처럼,
      //      예2) CarFactory factory = CarFactory.getInstance(); 
      //
      //      생성자의 private접근으로 막혀있어 new연산자를 이용하지 않고 스태틱 메서드를 호출하여 
      //      인스턴스를 생성하는 경우 다음 둘 중 하나다.
      //
      //      1) 인스턴스 생성 과정(초기화 과정)이 복잡한 경우 (Exam0221)
      //      2) 인스턴스를 한 개만 생성해야 하는 경우 (Exam0222)


      // 인스턴스를 공장처럼 만들어주는 메서드 = 팩토리 메서드
    }
  }







