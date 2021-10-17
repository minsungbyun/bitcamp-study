package com.eomcs.pms.handler;

<<<<<<< HEAD
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
import com.eomcs.util.Prompt;

public class ProjectAddHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;
  MemberPrompt memberPrompt;

  public ProjectAddHandler(RequestAgent requestAgent, MemberPrompt memberPrompt) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
  ProjectDao projectDao;
  MemberPrompt memberPrompt;

  public ProjectAddHandler(ProjectDao projectDao, MemberPrompt memberPrompt) {
    this.projectDao = projectDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    this.memberPrompt = memberPrompt;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
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
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.insert", project);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("프로젝트를 저장했습니다!");
    } else {
      System.out.println("프로젝트 저장 실패!");
    }
<<<<<<< HEAD
=======
=======
    projectDao.insert(project);

    System.out.println("프로젝트를 저장했습니다!");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  }
}





