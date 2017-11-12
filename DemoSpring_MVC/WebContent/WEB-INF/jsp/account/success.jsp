<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Username : ${account.username }<br>
	Password : ${account.password }<br>
	Description : ${account.description }<br>
	Status : ${account.status }<br>
	Langguage : ----
	<c:forEach var="lang" items="${account.languages }">
		${lang } ----
	</c:forEach>
	
	<br>
	Gender : ${account.gender }
	
	<br>
	Role : ${account.role }
	<br>
 ID : ${account.id }
	<img alt="" src="${pageContext.request.contextPath }/assets/image/${account.photo } ">
</body>
</html>