package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectDeleteHandler extends AbstractProjectHandler {

  public ProjectDeleteHandler(List<Project> projectList) {
    super(projectList);
  }

  @Override
  public void execute(CommandRequest request) {
    System.out.println("[프로젝트 삭제]");
    int no = (int) request.getAttribute("no");

    Project project = findByNo(no);

    if (project == null) {
=======
import java.util.HashMap;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class ProjectDeleteHandler implements Command {

  RequestAgent requestAgent;

  public ProjectDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 삭제]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("project.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      System.out.println("해당 번호의 프로젝트가 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
    Project project = requestAgent.getObject(Project.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("삭제 권한이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("프로젝트 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    projectList.remove(project);
=======
    requestAgent.request("project.delete", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("프로젝트 삭제 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    System.out.println("프로젝트를 삭제하였습니다.");
  }
}





