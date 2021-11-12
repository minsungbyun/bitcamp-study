package com.eomcs.pms.handler;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
<<<<<<< HEAD
import java.util.HashMap;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
=======
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Project;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
import com.eomcs.util.Prompt;

public class ProjectDeleteHandler implements Command {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  RequestAgent requestAgent;

  public ProjectDeleteHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
<<<<<<< HEAD
=======
=======
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  ProjectDao projectDao;
  SqlSession sqlSession;

  public ProjectDeleteHandler(ProjectDao projectDao, SqlSession sqlSession) {
    this.projectDao = projectDao;
<<<<<<< HEAD
    this.sqlSession = sqlSession;
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[프로젝트 삭제]");
    int no = (int) request.getAttribute("no");

<<<<<<< HEAD
    Project project = projectDao.findByNo(no);

    if (project == null) {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("project.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
<<<<<<< HEAD
=======
=======
    Project project = projectDao.findByNo(no);

    if (project == null) {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
      System.out.println("해당 번호의 프로젝트가 없습니다.");
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
    Project project = requestAgent.getObject(Project.class);

=======
<<<<<<< HEAD
    Project project = requestAgent.getObject(Project.class);

=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10
    if (project.getOwner().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("삭제 권한이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("프로젝트 삭제를 취소하였습니다.");
      return;
    }

<<<<<<< HEAD
    try {
      projectDao.deleteMember(project.getNo());
      projectDao.delete(no);
      sqlSession.commit();
    } catch (Exception e) {
      // 예외가 발생하기 전에 성공한 작업이 있으면 모두 취소한다.
      // 그래야 다음 작업에 영향을 끼치지 않는다.
      sqlSession.rollback();
    }
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    requestAgent.request("project.delete", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("프로젝트 삭제 실패!");
      System.out.println(requestAgent.getObject(String.class));
      return;
    }
<<<<<<< HEAD
=======
=======
    projectDao.delete(no);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
>>>>>>> 057647187ccaaf1e1c03112688dab02845955c10

    System.out.println("프로젝트를 삭제하였습니다.");
  }
}





