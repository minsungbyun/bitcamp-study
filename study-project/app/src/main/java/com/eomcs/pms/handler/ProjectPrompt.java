package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.util.List;
import com.eomcs.pms.domain.Project;
=======
import java.util.Collection;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class ProjectPrompt {

<<<<<<< HEAD
  protected List<Project> projectList;

  public ProjectPrompt(List<Project> projectList) {
    this.projectList = projectList;
  }

  public Project promptProject() {
    System.out.println("프로젝트:");
    for (Project project : projectList) {
      System.out.printf("  %d. %s\n", project.getNo(), project.getTitle());
    }
=======
  protected RequestAgent requestAgent;

  public ProjectPrompt(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  public Project promptProject() throws Exception {
    System.out.println("프로젝트:");

    requestAgent.request("project.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return null;
    }

    Collection<Project> projectList = requestAgent.getObjects(Project.class);

    for (Project project : projectList) {
      System.out.printf("  %d. %s\n", project.getNo(), project.getTitle());
    }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    while (true) {
      int projectNo = Prompt.inputInt("프로젝트 번호 선택? (취소: 0) ");
      if (projectNo == 0) {
        return null;
      }
<<<<<<< HEAD
      Project selectedProject = findByNo(projectNo);
=======
      Project selectedProject = findByNo(projectNo, projectList);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      if (selectedProject != null) {
        return selectedProject;
      }
      System.out.println("프로젝트 번호가 옳지 않습니다.");
    }
  }

<<<<<<< HEAD
  protected Project findByNo(int no) {
=======
  protected Project findByNo(int no, Collection<Project> projectList) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    for (Project project : projectList) {
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
