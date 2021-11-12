package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class MemberDeleteHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;

  public MemberDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  MemberDao memberDao;
  SqlSession sqlSession;

  public MemberDeleteHandler(MemberDao memberDao, SqlSession sqlSession) {
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
    System.out.println("[회원 삭제]");
    int no = (int) request.getAttribute("no");

<<<<<<< HEAD
    Member member = memberDao.findByNo(no);

    if (member == null) {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("member.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
<<<<<<< HEAD
=======
=======
    Member member = memberDao.findByNo(no);

    if (member == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    memberDao.delete(no);
    sqlSession.commit();
=======
<<<<<<< HEAD
    requestAgent.request("member.delete", params);

=======
<<<<<<< HEAD
    requestAgent.request("member.delete", params);
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("회원 삭제 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
<<<<<<< HEAD
=======
=======
    memberDao.delete(no);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    System.out.println("회원을 삭제하였습니다.");
  }
}







