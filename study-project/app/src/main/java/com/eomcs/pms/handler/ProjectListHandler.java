package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Project;

public class ProjectListHandler extends AbstractProjectHandler {

  public ProjectListHandler(List<Project> projectList) {
    super(projectList);
  }

  @Override
  public void execute(CommandRequest request) {
    System.out.println("[프로젝트 목록]");

=======
import java.util.Collection;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;

public class ProjectListHandler implements Command {

  RequestAgent requestAgent;

  public ProjectListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 목록]");

    requestAgent.request("project.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Project> projectList = requestAgent.getObjects(Project.class);

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    for (Project project : projectList) {
      System.out.printf("%d, %s, %s ~ %s, %s, [%s]\n",
          project.getNo(), 
          project.getTitle(), 
          project.getStartDate(), 
          project.getEndDate(), 
          project.getOwner().getName(),
          project.getMemberNames());
    }
  }
}





