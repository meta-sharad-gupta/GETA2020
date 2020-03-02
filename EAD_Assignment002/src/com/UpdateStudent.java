package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Connection con = DatabaseConnectivity.initializeDatabase();
			PrintWriter out = response.getWriter();
			
			PreparedStatement stmt_email = con.prepareStatement("select id,email from student");
			ResultSet rs=stmt_email.executeQuery();
			String email=request.getParameter("email");
			int student_Id= Integer.valueOf(request.getParameter("studentID"));
			Boolean found=true;
			
			while(rs.next()){
				if( student_Id != rs.getInt(1) && email.equals(rs.getString(2)) ){
					out.println("<html><body><b> Duplicate email in Update </b><br></body></html>");
					found=false;
					break;
				}
			}
			
			if(found){
				PreparedStatement stmt = con.prepareStatement("UPDATE student SET firstName=? ,lastName=? ,fatherName=? ,class=? ,age=? where Id=?");
				stmt.setString(1, request.getParameter("firstName"));
				stmt.setString(2, request.getParameter("lastName"));
				stmt.setString(3, request.getParameter("fatherName"));
				stmt.setString(4, request.getParameter("class"));
				stmt.setInt(5, Integer.valueOf(request.getParameter("age")));
				stmt.setInt(6, Integer.valueOf(request.getParameter("studentID")));
				stmt.executeUpdate();
				stmt.close();
				con.close();
				
				out.println("<html><body><b>Successfully Updated</b><br></body></html>");

				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
				out.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
