package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

public class BoardListMenu extends Menu {

  BoardHandler boardHandler;

  public BoardListMenu(BoardHandler boardHandler) {
    super("게시판");
    this.boardHandler = boardHandler;
  }

  @Override
  public void execute() {
    boardHandler.list();
  }

}
