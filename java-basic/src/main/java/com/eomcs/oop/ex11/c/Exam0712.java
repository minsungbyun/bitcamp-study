<<<<<<< HEAD
// inner class 응용 I : 2단계 - 논스태틱 중첩 클래스(inner class) 사용 
=======
// inner class : 응용 I
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0712 {
<<<<<<< HEAD

  public static void main(String[] args) {
=======
  public static void main( String[] args) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    Musics2 m1 = new Musics2();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics2 m2 = new Musics2();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

<<<<<<< HEAD
    // Player가 사용할 바깥 클래스 Musics2의 객체를 넘길 때는 
    // 다음과 같이 파라미터가 아니라 
    // 생성자 호출 문장 앞쪽에 놓는다. 
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    Musics2.Player p1 = m1.new Player();
    Musics2.Player p2 = m2.new Player();

    p1.play();
    p2.play();
<<<<<<< HEAD
=======

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
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

<<<<<<< HEAD
  // 중첩 클래스가 바깥 클래스의 객체를 사용해야 한다면,
  // 스태틱 중첩 클래스로 만들지 말고 논스태틱 중첩 클래스(inner class)로 만들라.
  // 왜?
  // - 바깥 클래스의 인스턴스를 저장할 필드가 자동 생성된다.
  // - 생성자에 바깥 클래스의 인스턴스를 받는 파라미터가 자동으로 추가된다. 
  class Player {

    // 1) 논스태틱 중첩 클래스는 바깥 클래스의 인스턴스 주소를 저장할 필드가 
    //    자동으로 추가되기 때문에 다음과 같이 개발자가 따로 선언할 필요가 없다.
    //    Musics2 musics;

    // 2) 바깥 클래스의 인스턴스를 받는 파라미터가 생성자에 자동으로 추가되기 때문에 
    //    다음과 같이 바깥 클래스의 객체를 받는 파라미터를 개발자가 직접 선언할 필요가 없다.  
    public Player(/*Musics2 musics*/) {
      // 따라서 바깥 클래스의 객체 주소를 인스턴스 필드에 저장하는 코드를 작성할 필요가 없다.
      //      this.musics = musics;
    }

    public void play() {
      // 내부에 보관된 바깥 클래스의 객체를 사용하고 싶다면,
      // 다음과 같이 '바깥클래스명.this.멤버' 형식으로 접근한다. 
      for (final String song : Musics2.this.songs) {
=======

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
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


