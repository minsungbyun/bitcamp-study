package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;

public class MemberListHandler implements Command {

  RequestAgent requestAgent;

  public MemberListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;

public class MemberListHandler implements Command {

  MemberDao memberDao;

  public MemberListHandler(MemberDao memberDao) {
    this.memberDao = memberDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 목록]");

<<<<<<< HEAD
    requestAgent.request("member.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Member> memberList = requestAgent.getObjects(Member.class);
=======
    Collection<Member> memberList = memberDao.findAll();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    for (Member member : memberList) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          member.getNo(), 
          member.getName(), 
          member.getEmail(), 
          member.getTel(), 
          member.getRegisteredDate());
    }
  }
}







