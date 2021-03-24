<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>account select page</h1>
	
	<h3> name : ${dto.accountName} </h3>
	<h3> Number : ${dto.accountId} </h3>


	<a href="./accountDelete?accountId=${dto.accountId}">	delete	</a>
	<a href="./accountUpdate?accountId=${dto.accountId}">update</a>

</body>
</html>