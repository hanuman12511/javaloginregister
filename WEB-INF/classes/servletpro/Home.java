package servletpro;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Home extends HttpServlet{
  public void service(HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

 out.println("hello class");
 response.sendRedirect(request.getContextPath() + "/HomePage.jsp");

 
}
}