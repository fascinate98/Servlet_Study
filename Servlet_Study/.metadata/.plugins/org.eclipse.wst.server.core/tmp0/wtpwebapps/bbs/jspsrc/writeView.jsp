
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
                    <input class="input100" type="text" name="title" placeholder="한줄평을 적어주세요!" required>
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Please enter your message">
                    <textarea class="input100" name="advan" placeholder="이 기업의 장점을 적어주세요" required></textarea>
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Please enter your message">
                    <textarea class="input100" name="disadvan" placeholder="이 기업의 단점을 적어주세요" required></textarea>
                    <span class="focus-input100"></span>
                </div>
                <div class="star-ratings">                    
                    <div class="star-rating space-x-4 mx-auto">
                        <input type="radio" id="5-stars" name="rating" value="5" v-model="ratings"/>
                        <label for="5-stars" class="star pr-4">★</label>
                        <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings"/>
                        <label for="4-stars" class="star">★</label>
                        <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings"/>
                        <label for="3-stars" class="star">★</label>
                        <input type="radio" id="2-stars" name="rating" value="2" v-model="ratings"/>
                        <label for="2-stars" class="star">★</label>
                        <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                        <label for="1-star" class="star">★</label>
                    </div>
                <div class="container-contact100-form-btn">
                    <input class="contact100-form-btn" type = "hidden" name = "star" value=script.rate>
                    <input class="contact100-form-btn" type = "hidden" name = "action" value="write">
                    <input class="contact100-form-btn" type="submit" value="upload">
                </div>
            </form>
        </div>
	</div>
</div>
<script src="http://code.jquery.com/jquery-latest.js">

        
	var $starEls = $('#star span.star');
	var rate = 0;
	
	$starEls.each(function (index, el) {
	    $(el).on('click', function () {
	        rating(index);
	    });
	});
	
	function rating(score) {
	    $starEls.each(function (i, el) {
	        if (i <= score) {
	            $(el).addClass('on');
	        } else {
	            $(el).removeClass('on');
	        }
	    });
	
	    rate = score + 1;
	}
    </script>
    <script src="<%= request.getContextPath() %>/js/main.js"></script>
</body>
</html>