package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
<<<<<<< HEAD
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class BoardDeleteHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  BoardDao boardDao;
  SqlSession sqlSession;

  public BoardDeleteHandler(BoardDao boardDao, SqlSession sqlSession) {
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
    System.out.println("[게시글 삭제]");
    int no = (int) request.getAttribute("no");

<<<<<<< HEAD
    Board board = boardDao.findByNo(no);

    if (board == null) {
=======
<<<<<<< HEAD
    Board board = boardDao.findByNo(no);

    if (board == null) {
=======
<<<<<<< HEAD
    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("board.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
=======
    Board board = boardDao.findByNo(no);

    if (board == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    //    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
    //      System.out.println("삭제 권한이 없습니다.");
    //      return;
    //    }
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("삭제 권한이 없습니다.");
      return;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    boardDao.delete(no);
    sqlSession.commit();
=======
<<<<<<< HEAD
    boardDao.delete(no);
=======
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
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    System.out.println("게시글을 삭제하였습니다.");
  }
}







