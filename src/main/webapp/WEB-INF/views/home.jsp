<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="./account/accountList" >accountList</a> <br>



<c:if test="${empty member }">
<a href="./member/memberJoin">Join</a><br>
<a href="./member/memberLogin">Login</a><br>
</c:if>


<c:if test="${not empty member }">
<h3> ${member.id}님 환영합니다.</h3>
<a href="./member/memberPage">Mypage</a><br>
<a href="./member/memberLogout">Logout</a><br>
</c:if>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
