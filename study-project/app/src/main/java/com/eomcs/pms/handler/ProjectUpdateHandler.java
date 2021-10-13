package com.eomcs.pms.handler;

import java.sql.Date;
<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectUpdateHandler extends AbstractProjectHandler {

  MemberPrompt memberPrompt;

  public ProjectUpdateHandler(List<Project> projectList, MemberPrompt memberPrompt) {
    super(projectList);
=======
import java.util.HashMap;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class ProjectUpdateHandler implements Command {

  RequestAgent requestAgent;
  MemberPrompt memberPrompt;

  public ProjectUpdateHandler(RequestAgent requestAgent, MemberPrompt memberPrompt) {
    this.requestAgent = requestAgent;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    this.memberPrompt = memberPrompt;
  }

  @Override
<<<<<<< HEAD
  public void execute(CommandRequest request) {
    System.out.println("[프로젝트 변경]");
    int no = (int) request.getAttribute("no");

    Project project = findByNo(no);

    if (project == null) {
      System.out.println("해당 번호의 프로젝트가 없습니다.");
      return;
    }

=======
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 변경]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("project.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    Project project = requestAgent.getObject(Project.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("변경 권한이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("프로젝트명(%s)? ", project.getTitle()));
    String content = Prompt.inputString(String.format("내용(%s)? ", project.getContent()));
    Date startDate = Prompt.inputDate(String.format("시작일(%s)? ", project.getStartDate()));
    Date endDate = Prompt.inputDate(String.format("종료일(%s)? ", project.getEndDate()));

    List<Member> members = memberPrompt.promptMembers(String.format(
        "팀원(%s)?(완료: 빈 문자열) ", project.getMemberNames()));

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("프로젝트 변경을 취소하였습니다.");
      return;
    }

    project.setTitle(title);
    project.setContent(content);
    project.setStartDate(startDate);
    project.setEndDate(endDate);
    project.setMembers(members);

<<<<<<< HEAD
=======
    requestAgent.request("project.update", project);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("프로젝트 변경 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.println("프로젝트를 변경하였습니다.");
  }
}





