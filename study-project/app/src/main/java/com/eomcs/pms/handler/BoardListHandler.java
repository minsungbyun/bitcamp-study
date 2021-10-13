package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Board;

public class BoardListHandler extends AbstractBoardHandler {

  public BoardListHandler(List<Board> boardList) {
    super(boardList);
  }

  @Override
  public void execute(CommandRequest request) {
    System.out.println("[게시글 목록]");

=======
import java.util.Collection;
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;

public class BoardListHandler implements Command {

  RequestAgent requestAgent;

  public BoardListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 목록]");

    requestAgent.request("board.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Board> boardList = requestAgent.getObjects(Board.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    for (Board board : boardList) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          board.getNo(), 
          board.getTitle(), 
          board.getWriter().getName(),
          board.getRegisteredDate(),
          board.getViewCount(), 
          board.getLike());
    }
  }
}







