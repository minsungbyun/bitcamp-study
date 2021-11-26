package bitcamp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class App1WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] {RootConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {App1Config.class};
  }

  @Override
  protected String[] getServletMappings() {
    //  DispatcherServlet에 대해 URL 매핑 정보를 리턴한다.
    return new String[] {"/app1/*"};
  }

  @Override
  protected String getServletName() {
    // DistpatcherServlet의 이름을 리턴한다.
    return "app1";
  }


}
