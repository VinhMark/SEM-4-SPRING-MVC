<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form commandName="account"
		action="${pageContext.request.contextPath }/account/save.html"
		method="POST" enctype="multipart/form-data">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>Username</td>
				<td><s:input path="username" placeholder="Usernames" /></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><s:password path="password" /></td>

			</tr>
			<tr>
				<td>Description</td>
				<td><s:textarea path="description" col="20" row="5" /></td>

			</tr>
			<tr>
				<td>Status</td>
				<td><s:checkbox path="status" /></td>

			</tr>
			<tr>
				<td>Language</td>
				<td><s:checkboxes path="languages" items="${languages }"
						itemLabel="name" itemValue="id" /></td>

			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<s:radiobutton path="gender" value="male" />Male 
					<s:radiobutton path="gender" value="female" />Female
				</td>

			</tr>
			<tr>
				<td>Role</td>
				<td>
					<s:select path="role" items="${roles }" itemLabel="name" itemValue="id"></s:select>
				</td>

			</tr>
			<tr>
				<td>Image</td>
				<td>
					<input type="file" accept="images/*" name="image"> 
				</td>

			</tr>
			<tr>
			  <s:hidden path="id" />
				<td>&nbsp;</td>
				<td><input type="submit" value="Save" /></td>
				
			</tr>
		</table>
	</s:form>
</body>
</html>