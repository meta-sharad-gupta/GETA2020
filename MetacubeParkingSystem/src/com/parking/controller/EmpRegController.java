package com.parking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.parking.dao.EmployeeDao;
import com.parking.pojo.Employee;
import com.employee.validation.*;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;

@WebServlet("/EmpRegController")
public class EmpRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpRegController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fullName = request.getParameter("FullName");
		String gender = request.getParameter("Gender");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String contact = request.getParameter("Contact");
		String organization = request.getParameter("Organization");
		String confirmPassword= request.getParameter("ConfirmPassword");

		Employee employee = new Employee();
		employee.setFullName(fullName);
		employee.setGender(gender);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setContact(contact);
		employee.setOrganization(organization);
		employee.setConfirmPassword(confirmPassword);
//		if(!com.employee.validation.Validation.isValidFullName(employee)){
//		    String message = "Invalid Name";
//            request.setAttribute("nameValidationMessage", message);
//            request.getRequestDispatcher("signUp.jsp").include(request, response);
//		}
//		else 
		    if(!com.employee.validation.Validation.isValidEmail(employee)){
		    String message = "Invalid Email !!";
            request.setAttribute("emailValidationMessage", message);
            request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		else if(!com.employee.validation.Validation.isValidContactNumber(employee)){
		    String message = "Invalid Contact Number";
            request.setAttribute("numberValidationMessage", message);
            request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		else if(!com.employee.validation.Validation.isValidPassword(employee)){
		    String message = "Invalid Password";
            request.setAttribute("passwordValidationMessage", message);
            request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		else if(!com.employee.validation.Validation.isMatchPassword(employee)){
		    String message = "Password not Match";
            request.setAttribute("confirmPasswordValidationMessage", message);
            request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		else{
		int status = EmployeeDao.saveEmployeeDetails(employee);

		if(status == 1){
			HttpSession session=request.getSession();
			session.setAttribute("Email", email);
			System.out.println("hello");
			response.sendRedirect("vehicleRegistration.jsp");
		}
		else if(status == 2){
			String message = "Email id already exists !!";
			request.setAttribute("message", message);
			request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		else{
			request.getRequestDispatcher("signUp.jsp").include(request, response);
		}
		}

	}

}
