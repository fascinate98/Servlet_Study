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
	<ul>
			<li> 회원 이름 :  ${memobj.memName}  </li>
			<li> 회원 계정 :   ${memobj.memId} </li>
			<li> 회원 암호 :   ${memobj.memPw} </li>
			<li> 회원 전화번호 :  ${memobj.memPhone} </li>
		</ul><br>		
</body>
</html>