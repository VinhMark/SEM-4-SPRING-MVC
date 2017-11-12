<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/assets/css/style.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/demo.js"></script>
</head>
<body>
	Hello world
	
	<br>
	<img alt="" src="${pageContext.request.contextPath }/assets/image/product_img-3.jpg" onclick="clickme()">
	
	<br>
	${a }<br>
	${username }
	<br>
	<a href="${pageContext.request.contextPath }/demo/demo2.html">Demo 2</a><br>
	<a href="${pageContext.request.contextPath }/product.html">Product info</a><br>
	<a href="${pageContext.request.contextPath }/product/list.html">Product List</a><br>
	<a href="${pageContext.request.contextPath }/account.html">Form</a>
</body>
</html>