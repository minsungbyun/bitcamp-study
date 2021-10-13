package com.eomcs.pms.handler;

import java.sql.Date;
<<<<<<< HEAD
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class BoardAddHandler implements Command {

<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardAddHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
  BoardDao boardDao;

  public BoardAddHandler(BoardDao boardDao) {
    this.boardDao = boardDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));

    board.setWriter(AuthLoginHandler.getLoginUser());
    board.setRegisteredDate(new Date(System.currentTimeMillis()));

<<<<<<< HEAD
    requestAgent.request("board.insert", board);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 저장 실패!");
      return;
    }
=======
    boardDao.insert(board);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    System.out.println("게시글을 저장했습니다.");
  }
}







