package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class ProjectAddHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;
  MemberPrompt memberPrompt;

  public ProjectAddHandler(RequestAgent requestAgent, MemberPrompt memberPrompt) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  ProjectDao projectDao;
  MemberPrompt memberPrompt;
  SqlSession sqlSession;

  public ProjectAddHandler(ProjectDao projectDao, MemberPrompt memberPrompt, SqlSession sqlSession) {
    this.projectDao = projectDao;
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
    this.memberPrompt = memberPrompt;
    this.sqlSession = sqlSession;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 등록]");

    Project project = new Project();

    project.setTitle(Prompt.inputString("프로젝트명? "));
    project.setContent(Prompt.inputString("내용? "));
    project.setStartDate(Prompt.inputDate("시작일? "));
    project.setEndDate(Prompt.inputDate("종료일? "));
    project.setOwner(AuthLoginHandler.getLoginUser());
    project.setMembers(memberPrompt.promptMembers("팀원?(완료: 빈 문자열) "));

<<<<<<< HEAD
    try {
      projectDao.insert(project);
      for (Member m : project.getMembers()) {
        projectDao.insertMember(project.getNo(), m.getNo());
      }
      sqlSession.commit();
    } catch (Exception e) {
      // 예외가 발생하기 전에 성공한 작업이 있으면 모두 취소한다.
      // 그래야 다음 작업에 영향을 끼치지 않는다.
      sqlSession.rollback();
    }

    System.out.println("프로젝트를 저장했습니다!");
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.insert", project);

    if (requestAgent.getStatus().equals(RequestAgent.SUCCESS)) {
      System.out.println("프로젝트를 저장했습니다!");
    } else {
      System.out.println("프로젝트 저장 실패!");
    }
<<<<<<< HEAD
=======
=======
    projectDao.insert(project);

    System.out.println("프로젝트를 저장했습니다!");
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }
}





