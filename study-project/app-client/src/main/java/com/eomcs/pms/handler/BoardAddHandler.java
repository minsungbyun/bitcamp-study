package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
import java.sql.Date;
<<<<<<< HEAD
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class BoardAddHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardAddHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  BoardDao boardDao;
  SqlSession sqlSession;

  public BoardAddHandler(BoardDao boardDao, SqlSession sqlSession) {
    this.boardDao = boardDao;
<<<<<<< HEAD
    this.sqlSession = sqlSession;
=======
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(AuthLoginHandler.getLoginUser());
<<<<<<< HEAD

    boardDao.insert(board);
    sqlSession.commit();
=======
    board.setRegisteredDate(new Date(System.currentTimeMillis()));

<<<<<<< HEAD
    boardDao.insert(board);

=======
<<<<<<< HEAD
    requestAgent.request("board.insert", board);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 저장 실패!");
      return;
    }
=======
    boardDao.insert(board);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    System.out.println("게시글을 저장했습니다.");
  }
}







