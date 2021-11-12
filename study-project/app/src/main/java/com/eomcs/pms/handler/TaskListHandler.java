package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

<<<<<<< HEAD
public class TaskListHandler extends AbstractTaskHandler {

  public TaskListHandler(ProjectPrompt projectPrompt) {
    super(projectPrompt);
  }

  @Override
  public void execute(CommandRequest request) {
<<<<<<< HEAD
=======
=======
public class TaskListHandler implements Command {

  ProjectPrompt projectPrompt;

  public TaskListHandler(ProjectPrompt projectPrompt) {
    this.projectPrompt = projectPrompt;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    System.out.println("[작업 목록]");

    Project project = projectPrompt.promptProject();
    if (project == null) {
<<<<<<< HEAD
      System.out.println("작업 등록을 취소합니다.");
      return;
    }

    printTasks(project);
=======
      System.out.println("작업 조회를 취소합니다.");
      return;
    }

    TaskHandlerHelper.printTasks(project);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}





