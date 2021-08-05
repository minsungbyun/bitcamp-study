package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList2 extends LinkedList{



  public Member findByNo(int no) {
    Object[] arr = toArray();
    for (Object obj : arr) {
      Member member = (Member) obj;
      if (member.no == no) {
        return member;
      }
    }
    return null;
  }



  public boolean exist(String name) {
    Object[] arr = toArray();
    for (Object obj : arr) {
      Member member = (Member) obj;
      if (member.name == name) {
        return true;
      }
    }
    return false;
  }
}








