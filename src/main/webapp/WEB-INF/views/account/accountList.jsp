<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>account List page</title>




</head>
<body>


	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
	<h1>account List page</h1>



	<table class="table">

		<thead class="thead-dark">
			<tr>
				<th>name</th>
				<th>rate</th>
				<th>sale</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list }" var="dto">
				<tr>
					<td><a href="./accountSelect?accountId=${dto.accountId}">
							${dto.accountName} </a></td>
					<td>${dto.rate }</td>
					<td>${dto.accountSale }</td>
				</tr>
			</c:forEach>

		</tbody>



	</table>
	</div>
	
	



</body>
</html>