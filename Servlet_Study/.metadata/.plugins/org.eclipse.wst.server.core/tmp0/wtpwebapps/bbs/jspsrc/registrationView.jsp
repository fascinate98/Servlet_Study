
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "model.vo.*, java.util.ArrayList" %>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/header.css">
	<link rel="stylesheet" href = "<%= request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/registration.css">
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  </head>
<body>
  <div class="wrapper">
    <div class="navbar">
      <div class="inner_navbar">
        <div class="logo">
          <a href="#">BL<span>IND</span></a>
          		<%
					String name = "Guest";
					boolean islogin = false;
					MemberVO vo = (MemberVO)session.getAttribute("logininfo") ;
					if(vo == null){
						name = "Guest";
					}else{
						name = vo.getMem_name();
						islogin = true;
					}
				%>
				<p><%=name %>님 안녕하세요!</p>
        </div>
        <div class="menu">
          <ul>
			<li><a href="<%= request.getContextPath() %>/jspsrc/homeView.jsp" >Home</a></li>
            <li><a href="<%= request.getContextPath() %>/jspsrc/aboutUsView.jsp">About Us</a></li>
 			<li><a href="<%= request.getContextPath() %>/content?action=getalllist">Forum</a></li>
			<li><a href="<%= request.getContextPath() %>/content?action=getmylist">My Page</a></li>
           	<li>              
			  <%
              		if(islogin){%>
              			<a href="/bbs/memberset?action=logout">Logout</a>
              <% 	}else{ %>
              			<a href="<%= request.getContextPath() %>/jspsrc/loginView.jsp">Login</a>
            	  	
              <%  }
              %>
            	</li>
          </ul>
        </div>
      </div>
      <div class="hamburger">
        <i class="fas fa-bars"></i>
      </div>
    </div>
    
  <div class="container">
    <h1>Registration</h1>
    <div class="content">
      <form method="post" action="/bbs/memberset">
        <div class="user-details">
          <div class="txt_field">
            <input type="text" name = "memid" required>
            <span></span>
            <label>ID</label>
          </div>
          <div class="txt_field">
            <input type="text" name = "memname" required>
            <span></span>
            <label>Name</label>
          </div>
          <div class="txt_field">
            <input class = "pw" name = "mempw" type="password" id = "pw1" required>
            <span></span>
            <label>Password</label>
          </div>
          <div class="txt_field">
            <input class = "pw" type="password"  id = "pw2" required>
            <span></span>
            <label>Confirm Password</label>
          </div>
          <div class="txt_field">
            <input class = "email" name = "mememail" type="text" id = "email" required>
            <span></span>
            <label>Email</label>
          </div>
          <div class="txt_field">
            <input type="text" name = "memcompany" required>
            <span></span>
            <label>Company</label>
          </div>
          <input type = "hidden" name = "action" value="register">
          <input type="submit" value="Register">
        </div>
      
      </form>
    </div>
  </div>
  </div>
  <script src="<%= request.getContextPath() %>/js/main.js"></script>
</body>

</html>
