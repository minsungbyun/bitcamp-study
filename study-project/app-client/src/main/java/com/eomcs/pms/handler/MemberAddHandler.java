package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
=======
import java.sql.Date;
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

public class MemberAddHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;

  public MemberAddHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  MemberDao memberDao;
  SqlSession sqlSession;

  public MemberAddHandler(MemberDao memberDao, SqlSession sqlSession) {
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
    System.out.println("[회원 등록]");

    Member member = new Member();

    member.setName(Prompt.inputString("이름? "));
    member.setEmail(Prompt.inputString("이메일? "));
    member.setPassword(Prompt.inputString("암호? "));
    member.setPhoto(Prompt.inputString("사진? "));
    member.setTel(Prompt.inputString("전화? "));
<<<<<<< HEAD

=======
    member.setRegisteredDate(new Date(System.currentTimeMillis()));

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("member.insert", member);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("회원을 등록했습니다.");
    } else {
      System.out.println("회원 등록 실패!");
    }
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
    memberDao.insert(member);
    sqlSession.commit();

    System.out.println("회원을 등록했습니다.");
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }
}







