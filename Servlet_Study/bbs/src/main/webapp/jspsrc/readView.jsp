
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
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/text2.css">

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
					ContentVO cvo = (ContentVO)session.getAttribute("readone");
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
					<li><a href="#" class = "active">Forum</a></li>
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
        <div class="wrap-contact100">
            <form class="contact100-form validate-form" method="post" action="/bbs/content">
                <div class="wrap-input100 validate-input" data-validate="Please enter your name">
                    <input class="input100" type="text" name="title" value = "${readone.con_title}" >
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Please enter your message">
                    <textarea class="input100" name="advan" >${readone.con_advan}</textarea>
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Please enter your message">
                    <textarea class="input100" name="disadvan" >${readone.con_disadvan}</textarea>
                    <span class="focus-input100"></span>
                </div>
                <div class="star-ratings">                    
                    <div class="star-rating space-x-4 mx-auto">
                        <input type="radio" id="5-stars" name="rating" value="5"/>
                        <label for="5-stars" class="star pr-4">★</label>
                        <input type="radio" id="4-stars" name="rating" value="4"/>
                        <label for="4-stars" class="star">★</label>
                        <input type="radio" id="3-stars" name="rating" value="3" />
                        <label for="3-stars" class="star">★</label>
                        <input type="radio" id="2-stars" name="rating" value="2" />
                        <label for="2-stars" class="star">★</label>
                        <input type="radio" id="1-star" name="rating" value="1"  />
                        <label for="1-star" class="star">★</label>
                        
                    
                    </div>
                <div class="container-contact100-form-btn">
 					<input type = "hidden" name = "idnum" value = "${readone.num}">
                   <input  class="contact100-form-btn" type="submit" class = "submit"  name = "action" value="update">
                   <input  class="contact100-form-btn" type="submit" class = "submit" name = "action" value="delete">
                   <input   class="contact100-form-btn" type="submit" class = "submit" name = "action" value="recommend">
                   <input  class="contact100-form-btn" type="submit"  name = "action" value="goback">  
                </div>
                </div>
            </form>
        </div>
	</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	var sel = <%=cvo.getCon_star() %>;
	console.log(sel);
	$("input:radio[name='rating']:radio[value="+sel+"]").prop("checked", true);
	
	var writer = <%=cvo.getCon_writer() %>;
	var writer1 = <%=vo.getMem_idnum() %>;
	var c = $('.input100');

	if(writer != writer1){
		$(".input100").attr("disabled",true);
		$("input:radio[name='rating']").attr("disabled",true);

		$("input:submit[value='update']").hide();
		$("input:submit[value='delete']").hide();   
	}else{
		$(".input100").attr("disabled",false);
		$("input:submit[value='update']").show();
		$("input:submit[value='delete']").show();   
	}

	
});

</script>
<script src="<%= request.getContextPath() %>/js/main.js"></script>
</body>
</html>