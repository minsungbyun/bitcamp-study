package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
<<<<<<< HEAD
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class BoardSearchHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardSearchHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  BoardDao boardDao;

  public BoardSearchHandler(BoardDao boardDao) {
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
    System.out.println("[게시글 검색]");

    String input = Prompt.inputString("검색어? ");

<<<<<<< HEAD
    Collection<Board> boardList = boardDao.findByKeyword(input);
=======
<<<<<<< HEAD
    Collection<Board> boardList = boardDao.findByKeyword(input);
=======
<<<<<<< HEAD
    HashMap<String,String> params = new HashMap<>();
    params.put("keyword", String.valueOf(input));

    requestAgent.request("board.selectListByKeyword", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Board> boardList = requestAgent.getObjects(Board.class);
=======
    Collection<Board> boardList = boardDao.findByKeyword(input);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

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







