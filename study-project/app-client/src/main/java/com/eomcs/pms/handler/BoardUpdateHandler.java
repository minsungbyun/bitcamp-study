package com.eomcs.pms.handler;

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
import com.eomcs.util.Prompt;

public class BoardUpdateHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
  RequestAgent requestAgent;

  public BoardUpdateHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  BoardDao boardDao;

  public BoardUpdateHandler(BoardDao boardDao) {
    this.boardDao = boardDao;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 변경]");
    int no = (int) request.getAttribute("no");

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
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
    Board board = requestAgent.getObject(Board.class);

    //    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
    //      System.out.println("변경 권한이 없습니다.");
    //      return;
    //    }
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("변경 권한이 없습니다.");
      return;
    }
<<<<<<< HEAD

    Board temp = new Board();
    temp.setNo(board.getNo());
    temp.setRegisteredDate(board.getRegisteredDate());
    temp.setLike(board.getLike());
    temp.setViewCount(board.getViewCount());
    temp.setWriter(board.getWriter());
    temp.setTitle(Prompt.inputString(String.format("제목(%s)? ", board.getTitle())));
    temp.setContent(Prompt.inputString(String.format("내용(%s)? ", board.getContent())));
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    String title = Prompt.inputString(String.format("제목(%s)? ", board.getTitle()));
    String content = Prompt.inputString(String.format("내용(%s)? ", board.getContent()));
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    boardDao.update(temp);
=======
<<<<<<< HEAD
    board.setTitle(title);
    board.setContent(content);

    requestAgent.request("board.update", board);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 변경 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
=======

    board.setTitle(title);
    board.setContent(content);
    boardDao.update(board);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1

    System.out.println("게시글을 변경하였습니다.");
  }
}







