<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<h1>“더 이상 응모할 수 없어요… </h1>

<%	
SimpleDateFormat formatter1 = new SimpleDateFormat("HH시 mm분");
String from = formatter1.format(session.getCreationTime());
Date to = formatter1.parse(from);

Calendar cal = Calendar.getInstance(); 
cal.setTime(to);
cal.add(Calendar.MINUTE, 30);

String t = formatter1.format(cal.getTime()); 
out.print(t + "이후에 응모하거나 브라우저를 재기동한 후에 응모하세요”<br>");	

%>
</body>
</html>






