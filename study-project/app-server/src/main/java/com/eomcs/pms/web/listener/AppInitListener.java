package com.eomcs.pms.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {

    ServletContext sc = sce.getServletContext();
    sce.getServletContext().setAttribute("contextPath", sc.getContextPath());


  }


}
