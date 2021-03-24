<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	
	
	<form action="memberLogin" method="post">
	
		id<input type="text" name="id">	<br>
		pw<input type="password" name="pw">	<br>
		<button>log in</button>
	</form>
	
	
	
	
	
	
	
	
<%-- 	<h3> id : ${dto.id}</h3>	<br>
	<h3> pw : ${dto.pw}</h3>	<br>
	<h3> name :${dto.name}</h3>	<br>
	<h3> phone :${dto.phone}</h3>	<br>
	<h3> email :${dto.email}</h3>	<br> --%>


	
	
</body>
</html>