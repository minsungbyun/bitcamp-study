// inner class : 응용 I
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0711 {
  public static void main( String[] args) {
    Musics1 m1 = new Musics1();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics1 m2 = new Musics1();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

    Musics1.Player p1 = new Musics1.Player(m1);
    Musics1.Player p2 = new Musics1.Player(m2);

    p1.play();
    p2.play();

  }
}


class Musics1 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }


  static class Player {
    // 스태틱 중첩 클래스에서 바깥 클래스의 인스턴스를 사용하려면
    // 다음과 같이 바깥 클래스의 인스턴스 주소를 저장하는 변수를 개발자가 직접 선언해 줘야 한다.
    Musics1 music1;

    // Player가 사용 할 Music 객체를 생성자의 파라미터로 받는다.
    // 바깥 클래스의 인스턴스 주소를 받는 파라미터를
    public Player(Musics1 music) {
      this.music1 = music;
    }

    public void play() {
      // 이 메서드가 호출되려면, Player 객체가 존재해야 한다.
      // Player 객체가 존재하려면, Musics 객체가 존재해야 한다.
      // 따라서 이 메서드가 호출될 때는 이미 Musics 객체가 존재한 상태이다.
      // 그 Musics 객체로 Player 객체를 만든 것이다.
      // 따라서 inner class 의 객체는 항상 자신을 만든 객체의 주소를 보관한다.
      // => 바깥_클래스명.this 내장 변수에 보관한다.
      // => Player를 만든 Musics 객체를 사용하고 싶다면 "바깥_클래스명.this" 변수를 이용하라.
      //
      for (final String song : /*Musics.this.*/songs) {
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


