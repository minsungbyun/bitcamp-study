package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardUpdateHandler extends AbstractBoardHandler {

  public BoardUpdateHandler(List<Board> boardList) {
    super(boardList);
  }

  @Override
  public void execute(CommandRequest request) {
    System.out.println("[게시글 변경]");
    int no = (int) request.getAttribute("no");

    Board board = findByNo(no);

    if (board == null) {
=======
import java.util.HashMap;
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class BoardUpdateHandler implements Command {

  RequestAgent requestAgent;

  public BoardUpdateHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 변경]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("board.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
    Board board = requestAgent.getObject(Board.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("변경 권한이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("제목(%s)? ", board.getTitle()));
    String content = Prompt.inputString(String.format("내용(%s)? ", board.getContent()));

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    board.setTitle(title);
    board.setContent(content);
<<<<<<< HEAD
=======

    requestAgent.request("board.update", board);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("게시글 변경 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.println("게시글을 변경하였습니다.");
  }
}







