package servletpro;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("register");

   
   String email = request.getParameter("email");
   String name = request.getParameter("name");
   String password = request.getParameter("password");
   out.print(""+email);
   out.print(""+password);
   out.print(""+name);


Connection connection=null;
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			PreparedStatement stmt;
			String query="insert into  userdata(username,email,password) values(?,?,?)";
			stmt=connection.prepareStatement(query);
			stmt.setString(1,name);
			stmt.setString(2,email);
			stmt.setString(3,password);
			
			
			int row=stmt.executeUpdate(); // it returns no of rows affected.
			
			if(row>0)
			{
				out.print("register");
                 response.sendRedirect(request.getContextPath() + "/index.jsp"); 
			}
			
			else
			{
				System.out.println("Failed to upload image.");
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println("exc"+e);
		}


  /*  response.sendRedirect(request.getContextPath() + "/HomePage.jsp"); */
  
   
  }
  }