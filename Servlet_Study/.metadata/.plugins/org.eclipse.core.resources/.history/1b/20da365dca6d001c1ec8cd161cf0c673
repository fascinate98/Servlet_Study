<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Dokdo:400" rel="stylesheet">
</head>
<body>
<h1>연산 요청 결과</h1>
<hr>
<%
	Integer re = (Integer)request.getAttribute("result");
	int i = re.intValue();
    if(re != null) {
%>
		결과 : <%= i %> <br>
		
<%
    } else { %>
    
   
    	추출된 객체가 없슈!!
 <%   }%>
<hr>
<a href = "<%= request.getHeader("referer") %>" > 입력화면</a>
</body>
</html>