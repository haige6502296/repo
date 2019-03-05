package com.lct;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class First implements Servlet {
private ServletConfig servletConfig;
  @Override
  public void init(ServletConfig servletConfig) throws ServletException {
this.servletConfig=servletConfig;
    System.out.println("Servlet已经初始化！");
  }

  @Override
  public ServletConfig getServletConfig() {
    return servletConfig;
  }

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    servletResponse.setContentType("text/html");
    servletRequest.setCharacterEncoding("utf-8");
    servletResponse.setCharacterEncoding("UTF-8");

    PrintWriter out=servletResponse.getWriter();
    out.println("<html><body><h1>Servlet小实验</h1></br><h2>look at the Servlet application</h2></body></html>");
  }

  @Override
  public String getServletInfo() {
    return "copyright 2018-LCT";
  }

  @Override
  public void destroy() {
    System.out.println("Servlet生命周期结束！");
  }
}
