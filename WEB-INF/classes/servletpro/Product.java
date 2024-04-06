package servletpro;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Product extends HttpServlet{
  public void service(HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

 out.println("product");
 response.sendRedirect(request.getContextPath() + "/Product.jsp");
 
}
}