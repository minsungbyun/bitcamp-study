package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;

public class BoardListHandler implements Command {

  RequestAgent requestAgent;

  public BoardListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;

public class BoardListHandler implements Command {

  BoardDao boardDao;

  public BoardListHandler(BoardDao boardDao) {
    this.boardDao = boardDao;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 목록]");

<<<<<<< HEAD
    Collection<Board> boardList = boardDao.findAll();
=======
<<<<<<< HEAD
    Collection<Board> boardList = boardDao.findAll();
=======
<<<<<<< HEAD
    requestAgent.request("board.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Board> boardList = requestAgent.getObjects(Board.class);
=======
    Collection<Board> boardList = boardDao.findAll();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    for (Board board : boardList) {
      System.out.printf("%d, %s, %s, %s, %d\n", 
          board.getNo(), 
          board.getTitle(), 
          board.getWriter().getName(),
          board.getRegisteredDate(),
          board.getViewCount());
    }
  }
}







