// inner class : 응용 I
package com.eomcs.oop.ex11.c;

import java.util.ArrayList;
import java.util.List;

public class Exam0713 {
  public static void main( String[] args) {
    Musics3 m1 = new Musics3();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    Musics3 m2 = new Musics3();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

    Musics3.Player p1 = m1.createPlayer();
    Musics3.Player p2 = m2.createPlayer();

    p1.play();
    p2.play();

  }
}


class Musics3 {

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public void delete(final int index) {
    songs.remove(index);
  }

  public Player createPlayer() {
    return new Player();   // this.new Player(); 
  }


  class Player {

    public void play() {
      for (final String song : /*Musics.this.*/Musics3.this.songs) {
        System.out.println(song);
      }
      System.out.println("-----------------------------");
    }
  }


}


