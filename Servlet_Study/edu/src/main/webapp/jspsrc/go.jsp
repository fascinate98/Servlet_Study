<%@ page contentType="text/html; charset=utf-8"   %>
<!DOCTYPE html>
<html>
<HEAD>
<meta charset="UTF-8">
<TITLE>forward 액션 태그를 이용한 분기 예제  </TITLE>
</HEAD>
<BODY>
<% if(request.getParameter("study")==null || 
           request.getParameter("study").equals("") ){ %>
	<h2>study 라는 이름으로 전달된 쿼리가 존재하지 않습니다.</h2>
	<%} else  {
	
	String s = request.getParameter("study");
	if(s.equals("javascript")) {
		response.sendRedirect("http://www.w3schools.com/js/default.asp");
	} else if(s.equals("dom")) {
		response.sendRedirect("http://www.w3schools.com/js/js_htmldom.asp");	
	
	} else if(s.equals("ajax")) { 
		response.sendRedirect("http://www.w3schools.com/xml/ajax_intro.asp");	
	} else if(s.equals("json")) {
		response.sendRedirect("http://www.w3schools.com/js/js_json_intro.asp");	
	}else if(s.equals("jsp")) { %>
	   <jsp:forward page="exam6.jsp">
  		<jsp:param name="dan" value="7" />
 	 </jsp:forward>
		
<%	} else if(s.equals("html")) { %>
	   <jsp:forward page="/htmlexam/first.html"/>
<% 		}
	} %>
</BODY>
</HTML>
