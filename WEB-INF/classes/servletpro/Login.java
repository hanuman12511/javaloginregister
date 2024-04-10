package servletpro;


import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("logn");



   String email = request.getParameter("email");
   String password = request.getParameter("password");
   out.print(""+email);
   out.print(""+password);
  
Connection connection=null;
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:1118/java","root","");
			
            Statement statement=null;
            statement=connection.createStatement();
            String sql ="select * from userdata1 where email='"+email+"' && password='"+password+"'";
            out.print(sql);
       ResultSet resultSet = statement.executeQuery(sql);
       boolean test = false;   
       while( resultSet.next()){
                out.print("login select data");
                test =true;
                PreparedStatement stmt;
             String query="update userdata1 set status= ? ,otp =? where email =?  ";
			stmt=connection.prepareStatement(query);
			stmt.setString(1,"yes");
			stmt.setString(2,"9876");
			stmt.setString(3,email);
			
			
			
			int row=stmt.executeUpdate(); 
              
            }
            if(test){
                response.sendRedirect(request.getContextPath() + "/OtpPage.jsp");
            }
            else{
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            }
              
            //PreparedStatement stmt;
			/* String query="select * from userdata where email =? && password =?";
			stmt=connection.prepareStatement(query);
			
			stmt.setString(1,email);
			stmt.setString(2,password);
			
			
			int row=stmt.executeUpdate(); // it returns no of rows affected.
			
			if(row>0)
			{
				out.print("login");
                /*  response.sendRedirect(request.getContextPath() + "/index.jsp");  */
		/* 	} */
			
			/* else
			{
				System.out.println("Failed to upload image.");
			} */
			
			
		}
		catch (Exception e)
		{
			out.println("exc"+e);
		}


   /* response.sendRedirect(request.getContextPath() + "/HomePage.jsp"); */
  
   
  }
  }