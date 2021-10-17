// inner class : 응용 I
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0712 {
  public static void main( String[] args) {
    Musics2 m1 = new Musics2();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics2 m2 = new Musics2();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

    Musics2.Player p1 = m1.new Player();
    Musics2.Player p2 = m2.new Player();

    p1.play();
    p2.play();

  }
}


class Musics2 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }


  class Player {


    // 1) 논스태틱 중첩 클래스는 바깥 클래스의 인스턴스 주소를 저장할 필드가 내장되어 있기 때문에
    //  다음과 같이 개발자가 따로 선언할 필요 없다.
    //    Musics1 musics;

    // 바깥 클래스의 인스턴스를 받는 파라미터가 생성자에 자동으로 추가되기 때문에
    // 바깥 클래스의 객체를 받눈 파라미터를 개발자가 직접 선언 할 필요 없다.
    //    public Player(Musics1 music) {
    //      this.musics = music;
    //    }

    public void play() {
      // 이 메서드가 호출되려면, Player 객체가 존재해야 한다.
      // Player 객체가 존재하려면, Musics 객체가 존재해야 한다.
      // 따라서 이 메서드가 호출될 때는 이미 Musics 객체가 존재한 상태이다.
      // 그 Musics 객체로 Player 객체를 만든 것이다.
      // 따라서 inner class 의 객체는 항상 자신을 만든 객체의 주소를 보관한다.
      // => 바깥_클래스명.this 내장 변수에 보관한다.
      // => Player를 만든 Musics 객체를 사용하고 싶다면 "바깥_클래스명.this" 변수를 이용하라.
      //
      for (final String song : /*Musics.this.*/song) {
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


