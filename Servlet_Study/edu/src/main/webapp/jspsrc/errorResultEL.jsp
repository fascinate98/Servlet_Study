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
<h1>요청을 처리하는 동안 오류가 발생했어요..</h1>
<hr>
	오류의 원인 :  ${err}

<hr>
<a href = "<%= request.getHeader("referer") %>" > 입력화면</a>
</body>
</html>