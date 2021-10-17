<<<<<<< HEAD
// inner class 응용 II : inner 클래스와 인터페이스  
=======
// inner class : 응용 I
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0720 {
<<<<<<< HEAD

  public static void main(String[] args) {
=======
  public static void main( String[] args) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    Musics4 m1 = new Musics4();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics4 m2 = new Musics4();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

<<<<<<< HEAD
    // Musics4의 플레이어 객체를 생성한다.
    // 리턴 객체는 Player 규칙에 따라 만든 객체이다.
    Player p1 = m1.createPlayer();
    Player p2 = m2.createPlayer();

    p1.play();
    p2.play();
  }
}

// 음악 플레이어의 사용법을 정의한다. 
=======

    // Musics4의 플레이어 객체를 생성한다.
    // 리턴 객체는 Player 규칙
    Musics4.Player p1 = m1.createPlayer();
    Musics4.Player p2 = m2.createPlayer();

    p1.play();
    p2.play();

  }
}

// 음악 플레이어의 사용법을 정의
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
interface Player {
  void play();
}

<<<<<<< HEAD
=======


>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
class Musics4 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }

<<<<<<< HEAD
  // Player 구현 객체를 리턴한다.
  // Player 구현체는 Musics4의 inner 클래스로 되어 있다.
  public Player createPlayer() {
    return new PlayerImpl(); // ==> this.new PlayerImpl();  // 바깥 클래스의 객체 주소 생략!
  }

  // 인터페이스 구현체를 inner 클래스로 정의한다.
  class PlayerImpl implements Player {
    public void play() {
      for (final String song : Musics4.this.songs) {
=======
  public Player createPlayer() {
    return new PlayerImpl();   // this.new Player(); 
  }

  // 인터페이스 구현체를 inner 클래스로 정의한다.
  class PlayerImpl implements Player{


    public void play() {
      for (final String song : /*Musics.this.*/Musics4.this.songs) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


