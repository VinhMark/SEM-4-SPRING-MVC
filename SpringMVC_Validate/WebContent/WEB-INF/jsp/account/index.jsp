<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<s:form method="post" action="${pageContext.request.contextPath }/account/save.html" commandName="account">
		
		<table border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td>Username</td>
				<td><s:input path="username"/></td>
				<td><s:errors path="username"></s:errors></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><s:input path="password"/></td>
				<td><s:errors path="password"></s:errors></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><s:input type="number" path="age"/></td>
				<td><s:errors path="age"></s:errors></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><s:input path="email"/></td>
				<td><s:errors path="email"></s:errors></td>
			</tr>
			<tr>
				<td>Website</td>
				<td><s:input path="website"/></td>
				<td><s:errors path="website"></s:errors></td>
			</tr>
			
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"/></td>
			</tr>
		</table>
		
		
		
	</s:form>
	
</body>
</html>