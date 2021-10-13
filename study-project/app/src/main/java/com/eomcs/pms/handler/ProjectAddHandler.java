package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectAddHandler extends AbstractProjectHandler {

  MemberPrompt memberPrompt;

  public ProjectAddHandler(List<Project> projectList, MemberPrompt memberPrompt) {
    super(projectList);
=======
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class ProjectAddHandler implements Command {

  RequestAgent requestAgent;
  MemberPrompt memberPrompt;

  public ProjectAddHandler(RequestAgent requestAgent, MemberPrompt memberPrompt) {
    this.requestAgent = requestAgent;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    this.memberPrompt = memberPrompt;
  }

  @Override
<<<<<<< HEAD
  public void execute(CommandRequest request) {
=======
  public void execute(CommandRequest request) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    System.out.println("[프로젝트 등록]");

    Project project = new Project();

    project.setNo(Prompt.inputInt("번호? "));
    project.setTitle(Prompt.inputString("프로젝트명? "));
    project.setContent(Prompt.inputString("내용? "));
    project.setStartDate(Prompt.inputDate("시작일? "));
    project.setEndDate(Prompt.inputDate("종료일? "));
    project.setOwner(AuthLoginHandler.getLoginUser());
    project.setMembers(memberPrompt.promptMembers("팀원?(완료: 빈 문자열) "));

<<<<<<< HEAD
    projectList.add(project);

    System.out.println("프로젝트를 저장했습니다!");
=======
    requestAgent.request("project.insert", project);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("프로젝트를 저장했습니다!");
    } else {
      System.out.println("프로젝트 저장 실패!");
    }
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}





