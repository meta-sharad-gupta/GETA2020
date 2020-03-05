package com;

import java.io.*;
//import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			Connection con = DatabaseConnectivity.initializeDatabase();
			PrintWriter out = response.getWriter();
			
			PreparedStatement stmt = con.prepareStatement("insert into student values (Id,?,?,?,?,?,?)");
			PreparedStatement stmt_email = con.prepareStatement("select email from student");
			ResultSet rs=stmt_email.executeQuery();
			String email=request.getParameter("email");
			Boolean found=true;
			while(rs.next()){
				System.out.println(rs.getString(1));
				if(email.equals(rs.getString(1))){
					out.println("<html><body><b> Duplicate email </b><br></body></html>");
					found=false;
					break;
				}
			}
			if(found){
				stmt.setString(1, request.getParameter("firstname"));
				stmt.setString(2, request.getParameter("lastname"));
				stmt.setString(3, request.getParameter("fathername"));
				stmt.setString(4, request.getParameter("email"));
				stmt.setInt(5, Integer.valueOf(request.getParameter("class")));
				stmt.setInt(6, Integer.valueOf(request.getParameter("age")));
				
				stmt.executeUpdate();
				
				stmt.close();
				con.close();
				
				
				out.println("<html><body><b>Successfully Inserted</b><br></body></html>");
				
				RequestDispatcher rd=request.getRequestDispatcher("/index.html");
				rd.include(request, response);
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
