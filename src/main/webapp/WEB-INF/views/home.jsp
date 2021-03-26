<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<c:import url="./template/bootStrap.jsp"></c:import>
<title>Hello, world!</title>
</head>
<body>


	<c:import url="./template/header.jsp"></c:import>



	<h1>Home world!</h1>

	<a href="./account/accountList">accountList</a>
	<br>



	<c:if test="${empty member }">
		<a href="./member/memberJoin">Join</a>
		<br>
		<a href="./member/memberLogin">Login</a>
		<br>
	</c:if>


	<c:if test="${not empty member }">
		<h3>${member.id}님 환영합니다.</h3>
		<a href="./member/memberPage">Mypage</a>
		<br>
		<a href="./member/memberLogout">Logout</a>
		<br>
	</c:if>



</body>
</html>