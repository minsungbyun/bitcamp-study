package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.util.Prompt;

public class ProjectPrompt {

<<<<<<< HEAD
  protected RequestAgent requestAgent;

  public ProjectPrompt(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
=======
  ProjectDao projectDao;

  public ProjectPrompt(ProjectDao projectDao) {
    this.projectDao = projectDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }

  public Project promptProject() throws Exception {
    System.out.println("프로젝트:");

<<<<<<< HEAD
    requestAgent.request("project.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return null;
    }

    Collection<Project> projectList = requestAgent.getObjects(Project.class);
=======
    Collection<Project> projectList = projectDao.findAll();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    for (Project project : projectList) {
      System.out.printf("  %d. %s\n", project.getNo(), project.getTitle());
    }

    while (true) {
      int projectNo = Prompt.inputInt("프로젝트 번호 선택? (취소: 0) ");
      if (projectNo == 0) {
        return null;
      }
      Project selectedProject = findByNo(projectNo, projectList);
      if (selectedProject != null) {
        return selectedProject;
      }
      System.out.println("프로젝트 번호가 옳지 않습니다.");
    }
  }

  protected Project findByNo(int no, Collection<Project> projectList) {
    for (Project project : projectList) {
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
