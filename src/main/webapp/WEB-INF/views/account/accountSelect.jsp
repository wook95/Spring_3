<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Insert title here</title>
</head>



<body>

	<c:import url="../template/header.jsp"></c:import>

	<h1>account select page</h1>
	
	<h3> name : ${dto.accountName} </h3>
	<h3> Number : ${dto.accountId} </h3>

	
	<c:catch>
	<c:if test="${not empty member and member.id eq 'admin'}">
	<a href="./accountDelete?accountId=${dto.accountId}">	delete	</a>
	<a href="./accountUpdate?accountId=${dto.accountId}">update</a>
	</c:if>
	</c:catch>

	<a href="../privateAccount/privateAccountInsert?accountId=${dto.accountId}">계좌 개설</a>

</body>
</html>