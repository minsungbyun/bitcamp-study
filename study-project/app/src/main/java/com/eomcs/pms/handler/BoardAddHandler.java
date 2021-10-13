package com.eomcs.pms.handler;

import java.sql.Date;
<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddHandler extends AbstractBoardHandler {

  public BoardAddHandler(List<Board> boardList) {
    super(boardList);
  }

  @Override
  public void execute(CommandRequest request) {
=======
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class BoardAddHandler implements Command {

  RequestAgent requestAgent;

  public BoardAddHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));

    board.setWriter(AuthLoginHandler.getLoginUser());
    board.setRegisteredDate(new Date(System.currentTimeMillis()));

<<<<<<< HEAD
    boardList.add(board);
=======
    requestAgent.request("board.insert", board);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 저장 실패!");
      return;
    }

    System.out.println("게시글을 저장했습니다.");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}







