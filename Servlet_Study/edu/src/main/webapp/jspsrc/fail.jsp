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
<h1>선언문 태그</h1>
<hr>

<%
	String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분"));

	out.print(formatDate + "에 실패 ~~ 아쉽아쉽<br>");	
%>
<img src = "/edu/images/fail.png">
<a href="/edu/htmlexam/lottoForm3.html"> 로또 응모 </a>
</body>
</html>









