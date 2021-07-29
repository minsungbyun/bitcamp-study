package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int MAX_LENGTH = 5;

  static Board[] boards = new Board[MAX_LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[게시글 등록]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("이름? ");
    board.content = Prompt.inputString("이메일? ");
    board.writer = Prompt.inputString("암호? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    boards[size++] = board;
  }

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          boards[i].no, 
          boards[i].title, 
          boards[i].content, 
          boards[i].writer, 
          boards[i].registeredDate);
    }
  }




}
