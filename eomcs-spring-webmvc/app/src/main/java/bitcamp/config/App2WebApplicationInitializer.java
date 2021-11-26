package bitcamp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// 서블릿컨테이너 ==> ServletContainerInitializer.onStartup() 호출 : SpringServletContainerInitializer
// SpringServletContainerInitializer ==> WebApplicationInitializer
public class App2WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }
  //  
  //  @Override
  //  protected WebApplicationContext createRootApplicationContext() {
  //    // ContextLoaderListener에서 사용할 IoC컨테이너를  설정하고 싶지 않다면 그냥 null을 리턴한다.
  //    return null;
  //  }

  // 다음 메서드는 슈퍼클래스에서 이미 설정했다.
  // 따라서 서브 클래스에서 오버라이딩 할 필요가 없다.
  //  @Override
  //  protected WebApplicationContext createServletApplicationContext() {
  //    // 1) Dispatcher에서 사용할 IoC 컨테이너를 리턴한다.
  //    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
  //    context.register(AppConfig.class);
  //    return context;
  //  }

  //  대신 Annotation

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {App2Config.class};
  }

  @Override
  protected String[] getServletMappings() {
    //  DispatcherServlet에 대해 URL 매핑 정보를 리턴한다.
    return new String[] {"/app2/*"};
  }

  @Override
  protected String getServletName() {
    // DistpatcherServlet의 이름을 리턴한다.
    return "app2";
  }


}
