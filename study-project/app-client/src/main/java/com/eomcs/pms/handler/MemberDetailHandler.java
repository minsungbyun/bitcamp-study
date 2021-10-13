package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class MemberDetailHandler implements Command {

<<<<<<< HEAD
  RequestAgent requestAgent;

  public MemberDetailHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
  MemberDao memberDao;

  public MemberDetailHandler(MemberDao memberDao) {
    this.memberDao = memberDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 상세보기]");
    int no = Prompt.inputInt("번호? ");

<<<<<<< HEAD
    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("member.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
=======
    Member member = memberDao.findByNo(no);
    if (member == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

<<<<<<< HEAD
    Member member = requestAgent.getObject(Member.class);

=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
    System.out.printf("등록일: %s\n", member.getRegisteredDate());
    System.out.println();

<<<<<<< HEAD
    //    Member loginUser = AuthLoginHandler.getLoginUser(); 
    //    if (loginUser == null || (member.getNo() != loginUser.getNo() && !loginUser.getEmail().equals("root@test.com"))) {
    //      return;
    //    }
=======
    Member loginUser = AuthLoginHandler.getLoginUser(); 
    if (loginUser == null ||
        (!loginUser.getEmail().equals("root@test.com") && (member.getNo() != loginUser.getNo()))) { 
      return;
    }
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    request.setAttribute("no", no);

    while (true) {
      String input = Prompt.inputString("변경(U), 삭제(D), 이전(0)>");
      switch (input) {
        case "U":
        case "u":
          request.getRequestDispatcher("/member/update").forward(request);
          return;
        case "D":
        case "d":
          request.getRequestDispatcher("/member/delete").forward(request);
          return;
        case "0":
          return;
        default:
          System.out.println("명령어가 올바르지 않습니다!");
      }
    }
  }
}







