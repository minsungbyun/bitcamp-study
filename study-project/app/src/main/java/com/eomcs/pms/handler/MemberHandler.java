package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {

  static final int MAX_LANGTH = 5;
  static Member[] members = new Member[MAX_LANGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[회원 등록]");

    // 새 회원 정보를 담을 변수를 준비한다.
    // 낱개의 변수가 아니라 Member에 정의된 대로 묶음 변수를 만든다.

    Member member = new Member();

    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registerdDate = new Date(System.currentTimeMillis());


    members[size++] = member; // 객체 배열에 주소를 저장하

  }

  public static void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i< size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          members[i].no, members[i].name, members[i].email, members[i].tel, members[i].registerdDate);
    }
  }
}
