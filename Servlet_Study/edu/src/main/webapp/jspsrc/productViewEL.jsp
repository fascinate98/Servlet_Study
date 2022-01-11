<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="vo.ProductVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Dokdo:400" rel="stylesheet">
</head>
<body>
<h1>선택된 상품 정보는 다음과 같습니다.</h1>
<hr>

선택된 사과의 개수 :  ${product.apple}<br>
선택된 바나나의 개수 :  ${product.banana}<br>
선택된 한라봉의 개수 :  ${product.halabong}<br>

<hr>
<a href = "<%= request.getHeader("referer") %>" style = " background: linear-gradient(to right top, #861657, #ffa69e)"> 상품 선택화면</a>
</body>
</html>