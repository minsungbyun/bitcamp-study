package com.eomcs.pms.handler;

import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
<<<<<<< HEAD
=======
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.pms.domain.Task;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Task;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class TaskDeleteHandler implements Command {

<<<<<<< HEAD
  TaskDao taskDao;
  SqlSession sqlSession;

  public TaskDeleteHandler(TaskDao taskDao, SqlSession sqlSession) {
    this.taskDao = taskDao;
    this.sqlSession = sqlSession;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;
  ProjectPrompt projectPrompt;

  public TaskDeleteHandler(RequestAgent requestAgent, ProjectPrompt projectPrompt) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
  ProjectDao projectDao;
  ProjectPrompt projectPrompt;

  public TaskDeleteHandler(ProjectDao projectDao, ProjectPrompt projectPrompt) {
    this.projectDao = projectDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    this.projectPrompt = projectPrompt;
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[작업 삭제]");

    Project project = (Project) request.getAttribute("project");
    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("이 프로젝트의 관리자가 아닙니다.");
      return;
    }

    Task task = (Task) request.getAttribute("task");

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("작업 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    taskDao.delete(task.getNo());
    sqlSession.commit();

    System.out.println("작업를 삭제하였습니다.");
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    HashMap<String,String> params = new HashMap<>();
    params.put("taskNo", String.valueOf(task.getNo()));
    params.put("projectNo", String.valueOf(task.getProject().getNo()));

    requestAgent.request("project.task.delete", params);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("작업를 삭제하였습니다.");
    } else {
      System.out.println("작업 삭제 실패!");
    }

<<<<<<< HEAD
=======
=======
    projectDao.deleteTask(task.getProject().getNo(), task.getNo());
    System.out.println("작업를 삭제하였습니다.");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }
}





