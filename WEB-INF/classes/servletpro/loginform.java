package servletpro;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class loginform extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
 
   response.sendRedirect(request.getContextPath() + "/login.jsp");
   
  }
  }