package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;

public class MemberListHandler implements Command {

  RequestAgent requestAgent;

  public MemberListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;

public class MemberListHandler implements Command {

  MemberDao memberDao;

  public MemberListHandler(MemberDao memberDao) {
    this.memberDao = memberDao;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 목록]");

<<<<<<< HEAD
    Collection<Member> memberList = memberDao.findAll();
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("member.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Member> memberList = requestAgent.getObjects(Member.class);
<<<<<<< HEAD
=======
=======
    Collection<Member> memberList = memberDao.findAll();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

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







