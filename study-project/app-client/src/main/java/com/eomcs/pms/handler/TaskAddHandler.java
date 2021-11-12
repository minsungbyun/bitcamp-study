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
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class TaskAddHandler implements Command {

<<<<<<< HEAD
  TaskDao taskDao;
  SqlSession sqlSession;

  public TaskAddHandler(TaskDao taskDao, SqlSession sqlSession) {
    this.taskDao = taskDao;
    this.sqlSession = sqlSession;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;
  ProjectPrompt projectPrompt;

  public TaskAddHandler(RequestAgent requestAgent, ProjectPrompt projectPrompt) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
  ProjectDao projectDao;
  ProjectPrompt projectPrompt;

  public TaskAddHandler(ProjectDao projectDao, ProjectPrompt projectPrompt) {
    this.projectDao = projectDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    this.projectPrompt = projectPrompt;
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[작업 등록]");

    Project project = (Project) request.getAttribute("project");
    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("이 프로젝트의 관리자가 아닙니다.");
      return;
    }

    Task task = new Task();

    task.setProjectNo(project.getNo());
    task.setContent(Prompt.inputString("내용? "));
    task.setDeadline(Prompt.inputDate("마감일? "));
    task.setStatus(new TaskHandlerHelper(taskDao).promptStatus());
    task.setOwner(MemberPrompt.promptMember("담당자?(취소: 빈 문자열) ", project.getMembers()));
    if (task.getOwner() == null) {
      System.out.println("작업 등록을 취소합니다.");
      return; 
    }

<<<<<<< HEAD
    taskDao.insert(task);
    sqlSession.commit();

    System.out.println("작업을 등록했습니다.");
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.task.insert", task);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("작업을 등록했습니다.");
    } else {
      System.out.println("작업 저장 실패!");
    }

<<<<<<< HEAD
=======
=======
    projectDao.insertTask(task);

    System.out.println("작업을 등록했습니다.");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }
}





