<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::result</title>
	</head>
	<body>
		<h3>user1 결과</h3>
		
		<p>
			이름 : ${vo.name} <br>
			나이 : ${vo.age} <br>
			성별 : ${vo.gender} <br>
			휴대폰 : ${vo.hp} <br>
			취미 : 
			<c:forEach var="data" items="${vo.hobby}">
				${data},
			</c:forEach>
		</p>
		
		<a href="/Ch04/user2/register">등록하기</a>
		
	</body>
</html>