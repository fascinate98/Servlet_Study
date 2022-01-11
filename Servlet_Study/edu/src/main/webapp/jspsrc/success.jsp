<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>

<%
	String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분"));
	out.print(formatDate + "에 당첨 ~~ 축하축하<br>");	
%>
<img src = "/edu/images/success.png">

</body>
</html>









