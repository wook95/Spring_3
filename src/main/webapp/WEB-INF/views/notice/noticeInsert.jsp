<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap"></c:import>
<title>Insert title here</title>
</head>
<body>

	<h1>insert page</h1>
	
	
	<form action="./noticeInsert" method="post">
		<div class="form-group" >
		<label for="writer">Writer :</label>
		<input type="text" name="writer">
		</div>
		<div class="form-group" >
		<label for="title">title :</label>
		<input type="text" name="writer">
		</div>
		<div class="form-group" >
		<label for="contents">contents :</label>
		<input type="text" name="writer">
		</div>
	
	
	
	
	
	</form>

		
	
</body>
</html>