package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class BoardDeleteHandler implements Command {

<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
  BoardDao boardDao;

  public BoardDeleteHandler(BoardDao boardDao) {
    this.boardDao = boardDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 삭제]");
    int no = (int) request.getAttribute("no");

<<<<<<< HEAD
    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("board.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
=======
    Board board = boardDao.findByNo(no);

    if (board == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

<<<<<<< HEAD
    //    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
    //      System.out.println("삭제 권한이 없습니다.");
    //      return;
    //    }
=======
    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("삭제 권한이 없습니다.");
      return;
    }
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    requestAgent.request("board.delete", params);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 삭제 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
=======
    boardDao.delete(no);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    System.out.println("게시글을 삭제하였습니다.");
  }
}







