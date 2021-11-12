package com.eomcs.pms.handler;

import java.util.Collection;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;

public class ProjectListHandler implements Command {

  RequestAgent requestAgent;

  public ProjectListHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;

public class ProjectListHandler implements Command {

  ProjectDao projectDao;

  public ProjectListHandler(ProjectDao projectDao) {
    this.projectDao = projectDao;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 목록]");

<<<<<<< HEAD
    Collection<Project> projectList = projectDao.findAll();
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return;
    }

    Collection<Project> projectList = requestAgent.getObjects(Project.class);
<<<<<<< HEAD
=======
=======
    Collection<Project> projectList = projectDao.findAll();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

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





