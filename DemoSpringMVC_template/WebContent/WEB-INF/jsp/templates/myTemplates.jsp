<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="titles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/home.html">Home</a>
	<a href="${pageContext.request.contextPath }/about.html">About Us</a>
	<a href="${pageContext.request.contextPath }/news.html">News</a>
	<br><br>
	
	<titles:insertAttribute name="content"></titles:insertAttribute>
	
	<br><br>
	
	Copyright 2017 
</body>
</html>