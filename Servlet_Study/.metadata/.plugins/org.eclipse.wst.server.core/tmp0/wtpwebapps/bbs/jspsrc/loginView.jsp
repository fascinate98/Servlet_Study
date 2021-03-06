
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "model.vo.*, java.util.ArrayList" %>
<!DOCTYPE html>
<!-- Coding By CodingNepal - youtube.com/codingnepal -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>

	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/header.css">
	<link rel="stylesheet" href = "<%= request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/login.css">
 
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
              			<a href="<%= request.getContextPath() %>/jspsrc/loginView.jsp" class = "active">Login</a>
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


    <div class="center">
      <h1>Login</h1>
      <form method="post" action="/bbs/memberset">
        <div class="txt_field">
          <input type="text" name = "memid" required>
          <span></span>
          <label>ID</label>
        </div>
        <div class="txt_field">
          <input type="password"  name = "mempw"  required>
          <span></span>
          <label>Password</label>
        </div>
        <div class="pass">Forgot Password?</div>
        <input type="submit" value="Login">
        <input type = "hidden" name = "action" value="login">
        <div class="signup_link">
          Not a member? <a href="<%= request.getContextPath() %>/jspsrc/registrationView.jsp">Signup</a>
        </div>
      </form>
    </div>
  </div>
<script src="<%= request.getContextPath() %>/js/main.js"></script>

  </body>
</html>
