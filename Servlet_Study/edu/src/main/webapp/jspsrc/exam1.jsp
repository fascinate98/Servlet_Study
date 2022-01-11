<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP학습예제1</title>
</head>
<body>
<h1>JSP응애</h1>
<hr>
<h3>현재 시간 정보 : <%= LocalDateTime.now() %></h3>
</body>
</html>