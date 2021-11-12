package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
=======
import java.sql.Date;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.request.RequestAgent;
<<<<<<< HEAD
=======
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class TaskUpdateHandler implements Command {

<<<<<<< HEAD
  TaskDao taskDao;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  ProjectPrompt projectPrompt;
  SqlSession sqlSession;

<<<<<<< HEAD
  public TaskUpdateHandler(TaskDao taskDao, SqlSession sqlSession) {
    this.taskDao = taskDao;
    this.sqlSession = sqlSession;
=======
  public TaskUpdateHandler(RequestAgent requestAgent, ProjectPrompt projectPrompt) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
  ProjectDao projectDao;
  ProjectPrompt projectPrompt;

  public TaskUpdateHandler(ProjectDao projectDao, ProjectPrompt projectPrompt) {
    this.projectDao = projectDao;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    this.projectPrompt = projectPrompt;
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[작업 변경]");

    Project project = (Project) request.getAttribute("project");

    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("이 프로젝트의 관리자가 아닙니다.");
      return;
    }

    Task task = (Task) request.getAttribute("task");
    task.setContent(Prompt.inputString(String.format("내용(%s)? ", task.getContent())));
    task.setDeadline(Prompt.inputDate(String.format("마감일(%s)? ", task.getDeadline())));
    task.setStatus(new TaskHandlerHelper(taskDao).promptStatus(task.getStatus().getNo()));

    Member owner = MemberPrompt.promptMember(
        String.format("담당자(%s)?(취소: 빈 문자열) ", task.getOwner().getName()), 
        project.getMembers());
    if (owner == null) {
      System.out.println("작업 변경을 취소합니다.");
      return;
    }

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("작업 변경을 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    taskDao.update(task);
    sqlSession.commit();

    System.out.println("작업를 변경하였습니다.");
=======
    task.setContent(content);
    task.setDeadline(deadline);
    task.setStatus(status);
    task.setOwner(owner);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.task.update", task);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("작업를 변경하였습니다.");
    } else {
      System.out.println("작업 변경 실패!");
    }
<<<<<<< HEAD
=======
=======
    projectDao.updateTask(task);

    System.out.println("작업를 변경하였습니다.");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }
}





