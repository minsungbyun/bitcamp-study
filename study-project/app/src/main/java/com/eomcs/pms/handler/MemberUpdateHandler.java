package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberUpdateHandler extends AbstractMemberHandler {

  public MemberUpdateHandler(List<Member> memberList) {
    super(memberList);
  }

  @Override
  public void execute(CommandRequest request) {
    System.out.println("[회원 변경]");
    int no = (int) request.getAttribute("no");

    Member member = findByNo(no);

    if (member == null) {
=======
import java.util.HashMap;
import com.eomcs.pms.domain.Member;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class MemberUpdateHandler implements Command {

  RequestAgent requestAgent;

  public MemberUpdateHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[회원 변경]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("member.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
    Member member = requestAgent.getObject(Member.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
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
=======
    requestAgent.request("member.update", member);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("회원 변경 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.println("회원을 변경하였습니다.");
  }
}







