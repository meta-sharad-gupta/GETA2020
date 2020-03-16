<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Employee Registration</title>
    <link href="parking.css" rel="stylesheet"></link>
    <link href="global.css" rel="stylesheet"></link>
	<script type="text/javascript" src="employeeValidation.js"></script>
	<script type="text/javascript" src="passwordValidation.js"></script>
</head>
<body>
	<div class="employee-registration-container">
		 <!-- Employee registration starts -->
	    <div id="add-employee" class="add-employee">
	    <span class="login-account"> Already Register? &nbsp;
						<a href="login.jsp">Login</a>
					</span>
					<span><h3></h3></span>
	        <h1 class="M0">EMPLOYEE DETAILS</h1>
	        <form id="employee-details-form" autocomplete="off" action="EmpRegController" method="post" onsubmit="return employeeRegistration()">
	            <div class="form-label-input-container">
	                <div class="input-data">
	                    <label class="form-label">Full Name</label>
	                    <input class="form-control" id="FullName" type="text" name="FullName" placeholder="Enter Full Name" autofocus required>
	                    <br/>
	                    <span class="validation-message" id='invalidName'></span>
	                </div>
	                  <% 
					if(request.getAttribute("nameValidationMessage") != null){
					%>
						<p class="login-error M0"><%=request.getAttribute("nameValidationMessage")%></p>
					<%
					}
					%>
	                <div class="input-data">
	                    <label class="form-label">Gender</label>
	                    <label><input id="Gender" type="radio" name="Gender" value="Male" checked="checked" autofocus required class="form-control radio-btn M0">&nbsp; Male</label>
	                    <label><input id="Gender" type="radio" name="Gender" value="Female" autofocus required class="form-control radio-btn M0">&nbsp; Female</label>
	                    <label><input id="Gender" type="radio" name="Gender" value="Other" autofocus required class="form-control radio-btn M0">&nbsp; Other</label>
	                </div>
	                <div class="input-data">
	                    <label class="form-label">Email</label>
	                    <input class="form-control" id="Email" type="text" name="Email" placeholder="Enter Email" autofocus required>
	                    <br/>
	                    <span class="validation-message" id='invalidEmail'></span>
	                </div>
	                <%
						if (request.getAttribute("message") != null) {
					%>
					<p class="login-error M0"><%=request.getAttribute("message")%></p>
					<%
						}
					%>
	                <% 
					if(request.getAttribute("emailValidationMessage") != null){
					%>
						<p class="login-error M0"><%=request.getAttribute("emailValidationMessage")%></p>
					<%
					}
					%>
	                <div class="input-data">
	                    <label class="form-label">Contact Number</label>
	                    <span>+91</span>
	                    <input class="form-control form-control-contact" id="Contact" type="text" name="Contact" placeholder="Enter Contact Number" autofocus required>
	                    <br/>
	                    <span class="validation-message" id='invalidContact'></span>
	                </div>
	                  <% 
					if(request.getAttribute("numberValidationMessage") != null){
					%>
						<p class="login-error M0"><%=request.getAttribute("numberValidationMessage")%></p>
					<%
					}
					%>
	                <div class="input-data">
	                    <label class="form-label">Organization</label>
	                    <select id="Organization" name="Organization" class="form-control form-control-organization" required>
	                        <option value="M1">M1</option>
	                        <option value="M2">M2</option>
	                        <option value="M3">M3</option>
	                    </select>&nbsp
	                </div>
	                <div class="input-data">
	                    <label class="form-label">Password</label>
	                    <input class="form-control" id="Password" type="password" name="Password" placeholder="Enter Password" onblur="checkPasswordValidation();" required onselectstart="return false" onpaste="return false;" onCopy="return false" onCut="return false" onDrag="return false" onDrop="return false" autocomplete=off>
	                    <br/>
	                    <span class="validation-message" id='invalidPassword'></span>
	                </div>
	  <% 
					if(request.getAttribute("passwordValidationMessage") != null){
					%>
						<p class="login-error M0"><%=request.getAttribute("passwordValidationMessage")%></p>
					<%
					}
					%>
	                <div class="input-data">
	                    <label class="form-label">Confirm Password</label>
	                    <input class="form-control" id="ConfirmPassword" type="password" name="ConfirmPassword" placeholder="Confirm Password" onkeyup="checkPasswordEqual();" onselectstart="return false" onpaste="return false;" onCopy="return false" onCut="return false" onDrag="return false" onDrop="return false" autocomplete=off>
	                    <br/>
	                    <span class="validation-message" id='equalPassword'></span>
	                </div>
	                  <% 
					if(request.getAttribute("confirmPasswordValidationMessage") != null){
					%>
						<p class="login-error M0"><%=request.getAttribute("confirmPasswordValidationMessage")%></p>
					<%
					}
					%>
	                <div class="input-data">
	                    <input class="employee-details-form-submit" id="Submit" type="submit" value="Register">
	                </div>
	 				
	            </div>
	        </form>
	    </div>
	    <!-- Employee registration end -->
	    
	</div>
</body>

</html>