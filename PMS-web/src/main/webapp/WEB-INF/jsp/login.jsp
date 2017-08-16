<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<a href="register.do"><h4>New User Register here</h4></a>
<a href="project.do"><h4>Projects</h4></a>
User Login
	<form:form method="POST" action="checkLogin.do"
		modelAttribute="UserLogin">
		<table  border="0" bordercolor="blue" cellpadding="1" cellspacing="0" >
			<tr>
				<td align="center">Mail Id</td>
				<td align="center"><form:input path="mailId" id="mailId" /></td>
				<td><span style="color:red"><form:errors path="mailId"></form:errors></span></td>
			</tr>
			<tr>
				<td align="center">Password</td>
				<td align="center"><form:password path="pass" id="password" /> </td>
				<td><span style="color:red;"><form:errors path="pass" ></form:errors></span></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>