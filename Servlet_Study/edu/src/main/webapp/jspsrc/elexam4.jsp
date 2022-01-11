<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ page import="jspbean.*, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">  
<title>EL 테스트</title> 
</head>
<body>
<h2>객체의 getter 메서드, 컬렉션 객체의 원소, 클래스의 정적 멤버 사용</h2> 
<hr>
<%
//pageContext.setAttribute("msg", "PageContext 객체에 저장된 객체");
//request.setAttribute("msg", "HttpServletRequest 객체에 저장된 객체");
//session.setAttribute("msg", "HttpSession 객체에 저장된 객체");
//application.setAttribute("msg", "ServletContext 객체에 저장된 객체");
%>
pageScope객체에서추출 :  ${ pageScope.msg }<br> 
requestScope객체에서추출 :  ${ requestScope.msg }<br> 
sessionScope객체에서추출 :  ${ sessionScope.msg }<br> 
applicationScope객체에서추출 :  ${ applicationScope.msg }<br> 

<hr>
msg 추출 : ${mag} <br>
</body>
</html>