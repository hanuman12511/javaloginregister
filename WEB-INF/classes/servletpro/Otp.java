package servletpro;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;

public class Otp extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("register");

   
   String otp = request.getParameter("otp");
  
   out.print(""+otp);


Connection connection=null;
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:1118/java","root","");
			  Statement statement=null;
            statement=connection.createStatement();
            String sql ="select * from userdata1 where otp='"+otp+"'";
            out.print(sql);
       ResultSet resultSet = statement.executeQuery(sql);
       boolean test = false;   
       while( resultSet.next()){
                out.print("otp update");
                test =true;
                response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
            }
			
		}
		catch (Exception e)
		{
			out.println("exc"+e);
		}


  /*  response.sendRedirect(request.getContextPath() + "/HomePage.jsp"); */
  
   
  }
  }