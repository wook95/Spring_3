<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>

<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<h1>join</h1>

	<form action="memberJoin" method="post">

		id<input type="text" name="id"> <br> pw<input
			type="password" name="pw"> <br> name<input type="text"
			name="name"> <br> phone<input type="text" name="phone">
		<br> email<input type="text" name="email"> <br>
		<button>join</button>
	</form>



</body>
</html>