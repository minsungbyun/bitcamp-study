package com.eomcs.pms.handler;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
import java.util.HashMap;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;
<<<<<<< HEAD
=======
=======
import java.util.List;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class MemberPrompt {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;

  public MemberPrompt(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  protected Member findByName(String name) throws Exception {
    HashMap<String,String> params = new HashMap<>();
    params.put("name", name);

    requestAgent.request("member.selectOneByName", params);
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      return null;
    }
    return requestAgent.getObject(Member.class);
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  MemberDao memberDao;

  public MemberPrompt(MemberDao memberDao) {
    this.memberDao = memberDao;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  protected static Member findByName(String name, List<Member> memberList) {
    for (Member member : memberList) {
      if (member.getName().equalsIgnoreCase(name)) {
        return member;
      }
    }
    return null;
  }

  public Member promptMember(String label) throws Exception {
    while (true) {
      String memberName = Prompt.inputString(label);
      if (memberName.length() == 0) {
        return null;
      }

<<<<<<< HEAD
      Member member = memberDao.findByName(memberName);
=======
<<<<<<< HEAD
      Member member = findByName(memberName);
=======
<<<<<<< HEAD
      Member member = findByName(memberName);
=======
      Member member = memberDao.findByName(memberName);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      if (member != null) {
        return member;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }
  }

  public static Member promptMember(String label, List<Member> memberList) {
    while (true) {
      String memberName = Prompt.inputString(label);
      if (memberName.length() == 0) {
        return null;
      }

      Member member = findByName(memberName, memberList);
      if (member != null) {
        return member;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }
  }

  public List<Member> promptMembers(String label) throws Exception {
    ArrayList<Member> members = new ArrayList<>();

    while (true) {
      String memberName = Prompt.inputString(label);
<<<<<<< HEAD
      Member member = memberDao.findByName(memberName);
=======
<<<<<<< HEAD
      Member member = findByName(memberName);
=======
<<<<<<< HEAD
      Member member = findByName(memberName);
=======
      Member member = memberDao.findByName(memberName);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      if (member != null) {
        members.add(member);
        continue;
      } else if (memberName.length() == 0) {
        break;
      } 
      System.out.println("등록된 회원이 아닙니다.");
    }
    return members;
  }
}







