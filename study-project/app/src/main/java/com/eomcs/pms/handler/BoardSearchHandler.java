package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardSearchHandler extends AbstractBoardHandler {

  public BoardSearchHandler(List<Board> boardList) {
    super(boardList);
  }

  @Override
  public void execute(CommandRequest request) {
<<<<<<< HEAD
=======
=======
import java.util.Collection;
import java.util.HashMap;
import com.eomcs.pms.domain.Board;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class BoardSearchHandler implements Command {

  RequestAgent requestAgent;

  public BoardSearchHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    System.out.println("[게시글 검색]");

    String input = Prompt.inputString("검색어? ");

<<<<<<< HEAD
    for (Board board : boardList) {
      if (!board.getTitle().contains(input) &&
          !board.getContent().contains(input) &&
          !board.getWriter().getName().contains(input)) {
        continue;
      }
=======
    HashMap<String,String> params = new HashMap<>();
    params.put("keyword", String.valueOf(input));

    requestAgent.request("board.selectListByKeyword", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Board> boardList = requestAgent.getObjects(Board.class);

    for (Board board : boardList) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
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







