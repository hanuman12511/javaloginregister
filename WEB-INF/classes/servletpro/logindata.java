package servletpro;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class logindata extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
    String email = request.getParameter("email");
    String password = request.getParameter("password");
   out.println("logindata");
   out.println(email);
   out.println(password);
   if(email.equals("hanu@g.c") && password.equals("hanu123")){
    response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
   
   }
   else{
    response.sendRedirect(request.getContextPath() + "/login.jsp");
   
   }
  // response.sendRedirect(request.getContextPath() + "/Product.jsp");
   
  }
  }