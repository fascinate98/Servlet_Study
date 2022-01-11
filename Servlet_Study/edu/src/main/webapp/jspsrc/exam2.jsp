<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int member_v = 0; %>
<%
	int local_v = 0;
	member_v += 10;
	local_v += 10;
%>

<%! 
	int a(int i){
		i += 1;
		return i;
	}

%>

<h1>jsp의 멤버변수와 지역변수</h1>
<hr>
<ul>
	<li>멤버변수 : <%= member_v %>></li>
	<li>지역변수 : <%= local_v %>></li>
	<li><%= a(1) %></li>
</ul>
</body>
</html>