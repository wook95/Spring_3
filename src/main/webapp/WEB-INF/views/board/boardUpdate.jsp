<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../template/bootStrap.jsp"></c:import>


</head>
<body>

<c:import url="../template/header.jsp"></c:import>
	<h1>update page</h1>
	
	
	<form action="./noticeUpdate" method="post">
	
		<input type="hidden" name="num" value="${dto.num}">	
		title<input type="text" name="title" value="${dto.title}">
     	contents<input type="text" name="contents" value="${dto.contents}">	
     	
		<button>Update</button>
	
	</form>
	



</body>
</html>