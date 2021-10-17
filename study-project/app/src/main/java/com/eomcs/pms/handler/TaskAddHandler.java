package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
<<<<<<< HEAD
import com.eomcs.util.Prompt;

public class TaskAddHandler extends AbstractTaskHandler {

  public TaskAddHandler(ProjectPrompt projectPrompt) {
    super(projectPrompt);
  }

  @Override
  public void execute(CommandRequest request) {
<<<<<<< HEAD
=======
=======
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class TaskAddHandler implements Command {

  RequestAgent requestAgent;
  ProjectPrompt projectPrompt;

  public TaskAddHandler(RequestAgent requestAgent, ProjectPrompt projectPrompt) {
    this.requestAgent = requestAgent;
    this.projectPrompt = projectPrompt;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    System.out.println("[작업 등록]");

    Project project = projectPrompt.promptProject();
    if (project == null) {
      System.out.println("작업 등록을 취소합니다.");
      return;
    }

    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("이 프로젝트의 관리자가 아닙니다.");
      return;
    }

    Task task = new Task();

    task.setProject(project);
    task.setNo(Prompt.inputInt("작업번호? "));
    task.setContent(Prompt.inputString("내용? "));
    task.setDeadline(Prompt.inputDate("마감일? "));
<<<<<<< HEAD
    task.setStatus(promptStatus());
=======
    task.setStatus(TaskHandlerHelper.promptStatus());
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    task.setOwner(MemberPrompt.promptMember("담당자?(취소: 빈 문자열) ", project.getMembers()));
    if (task.getOwner() == null) {
      System.out.println("작업 등록을 취소합니다.");
      return; 
    }

<<<<<<< HEAD
    project.getTasks().add(task);

    System.out.println("작업을 등록했습니다.");
=======
    requestAgent.request("project.task.insert", task);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("작업을 등록했습니다.");
    } else {
      System.out.println("작업 저장 실패!");
    }

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}





