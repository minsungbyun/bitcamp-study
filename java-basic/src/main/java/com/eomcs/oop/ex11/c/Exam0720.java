// inner class : 응용 I
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0720 {
  public static void main( String[] args) {
    Musics4 m1 = new Musics4();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics4 m2 = new Musics4();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");


    // Musics4의 플레이어 객체를 생성한다.
    // 리턴 객체는 Player 규칙
    Musics4.Player p1 = m1.createPlayer();
    Musics4.Player p2 = m2.createPlayer();

    p1.play();
    p2.play();

  }
}

// 음악 플레이어의 사용법을 정의
interface Player {
  void play();
}



class Musics4 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }

  public Player createPlayer() {
    return new PlayerImpl();   // this.new Player(); 
  }

  // 인터페이스 구현체를 inner 클래스로 정의한다.
  class PlayerImpl implements Player{


    public void play() {
      for (final String song : /*Musics.this.*/Musics4.this.songs) {
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


