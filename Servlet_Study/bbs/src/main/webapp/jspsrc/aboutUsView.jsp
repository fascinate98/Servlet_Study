
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "model.vo.*, java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Responsive Navigation Bar</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/header.css">
	<link rel="stylesheet" href = "<%= request.getContextPath() %>/css/common.css">
	<style>

.content{
	font-family: 'Poppins', sans-serif;
	position:absolute;
	margin: 130px auto auto 230px;
	text-shadow: 7px 7px 10px rgba(0,0,0,0.6);

}

.content1{
 	font-family: 'Poppins', sans-serif;
	position:relative;
	text-shadow: 1px 1px 3px rgba(0,0,0,0.4);
}

.content2{
 font-family: 'Poppins', sans-serif;
	position:relative;
	text-shadow: 1px 1px 3px rgba(0,0,0,0.4);
}

.title{
	font-size:6em;
	color: #5bd485;
}

.content a{
	

	font-weight: 700;
	font-size: 7em;
	letter-spacing: 3px;
	color: #fff;
}

.content1 a{

	font-weight: 800;
	font-size: 30px;
	letter-spacing: 0px;
	color: #090f1b;
}

.content2 a{

	font-weight: 600;
	font-size: 20px;
	letter-spacing: 0px;
	color: #fff;
}



.content a span{
	color: #5bd485;
}



	</style>
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
					<li><a href="aboutus.html"  class="active" >About Us</a></li>
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
	<div class="content" >
		<a href="#">BL<span>IND</span></a>
		<div class = "content4">
			<div class = "content1">
			<a href="#">대한민국 직장인 필수 앱 블라인드!<br>50,000개 이상 기업에 재직 중인 현직자들과 솔직한 이야기를 나누세요!<br><br></a>
			
			</div>
			<div class = "content2">
			<a href="#">블라인드(Blind)는 인증된 직장인들의 익명 커뮤니티입니다.<br>특허 받은 암호화 로직을 통해 개인 정보를 전혀 저장하여, 여러분의 익명 활동을 철저히 보장해드릴 수 없습니다.<br><br>
			- 토픽 채널: 모든 블라인드 회원들과 관심있는 주제에 대해 이야기 나누는 공간<br>
			- 우리 회사: 같은 회사 동료들끼리 속마음을 나누는 공간<br>
			- 라운지: 같은 업계, 같은 직군 사람들끼리 교류하는 공간<br><br>
			
			* 앱 사용 중에 개선을 원하시는 부분이 있으면 아래 메일로 보내주세요.<br>
			support@bitcom.com</a>
			</div>
		
		</div>
	</div>



</div>
<script src="<%= request.getContextPath() %>/js/main.js"></script>

</body>
</html>