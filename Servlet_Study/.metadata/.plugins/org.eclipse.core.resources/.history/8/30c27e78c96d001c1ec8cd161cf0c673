<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="vo.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Dokdo:400" rel="stylesheet">
</head>
<body>
<h1>회원 정보</h1>
<hr>
<%
	MemberVO vo = (MemberVO)request.getAttribute("memobj");
    if(vo != null) {
%>
		<ul>
			<li> 회원 이름 :  <%= vo.getMemName() %> </li>
			<li> 회원 계정 :  <%= vo.getMemId() %> </li>
			<li> 회원 암호 :  <%= vo.getMemPw() %> </li>
			<li> 회원 전화번호 :  <%= vo.getMemPhone() %> </li>
		</ul><br>		
<%
    } else {
%>
    	추출된 객체가 없슈!!
<%	
    }
%>
</body>
</html>