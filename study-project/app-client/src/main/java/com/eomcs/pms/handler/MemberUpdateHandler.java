package com.eomcs.pms.handler;

import java.util.HashMap;
<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class MemberUpdateHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;

  public MemberUpdateHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  MemberDao memberDao;
  SqlSession sqlSession;

  public MemberUpdateHandler(MemberDao memberDao, SqlSession sqlSession) {
    this.memberDao = memberDao;
<<<<<<< HEAD
    this.sqlSession = sqlSession;
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 변경]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

<<<<<<< HEAD
    Member member = memberDao.findByNo(no);

    if (member == null) {
=======
<<<<<<< HEAD
    requestAgent.request("member.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
=======
<<<<<<< HEAD
    requestAgent.request("member.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
=======
    Member member = memberDao.findByNo(no);

    if (member == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
    Member member = requestAgent.getObject(Member.class);

=======
<<<<<<< HEAD
    Member member = requestAgent.getObject(Member.class);

=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
    String name = Prompt.inputString("이름(" + member.getName()  + ")? ");
    String email = Prompt.inputString("이메일(" + member.getEmail() + ")? ");
    String password = Prompt.inputString("암호? ");
    String photo = Prompt.inputString("사진(" + member.getPhoto() + ")? ");
    String tel = Prompt.inputString("전화(" + member.getTel() + ")? ");

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    member.setName(name);
    member.setEmail(email);
    member.setPassword(password);
    member.setPhoto(photo);
    member.setTel(tel);
<<<<<<< HEAD

    memberDao.update(member);
    sqlSession.commit();
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1

    requestAgent.request("member.update", member);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("회원 변경 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
<<<<<<< HEAD
=======
=======
    memberDao.update(member);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    System.out.println("회원을 변경하였습니다.");
  }
}







