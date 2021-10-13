package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class MemberDeleteHandler implements Command {

<<<<<<< HEAD
  RequestAgent requestAgent;

  public MemberDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
  MemberDao memberDao;

  public MemberDeleteHandler(MemberDao memberDao) {
    this.memberDao = memberDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 삭제]");
    int no = (int) request.getAttribute("no");

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

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    requestAgent.request("member.delete", params);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("회원 삭제 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
=======
    memberDao.delete(no);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    System.out.println("회원을 삭제하였습니다.");
  }
}







