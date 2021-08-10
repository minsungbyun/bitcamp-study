package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardDeleteMenu extends Menu {


  BoardHandler boardHandler;

  public BoardDeleteMenu(BoardHandler boardHandler) {
    super("게시판");
    this.boardHandler = boardHandler;
  }


  @Override
  public void execute() {
    boardHandler.delete();
  }


}
