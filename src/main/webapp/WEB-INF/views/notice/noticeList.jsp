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
	<h1>List page</h1>


	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">title</th>
				<th scope="col">writer</th>
				<th scope="col">regDate</th>
				<th scope="col">hit</th>
				<th scope="col">contents</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<th scope="row">${dto.num}</th>
					<td><a href="./noticeSelect?num=${dto.num}">${dto.title}</a></td>
					<td>${dto.writer}</td>
					<td>${dto.regDate}</td>
					<td>${dto.hit}</td>
					<td>${dto.contents}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form action="./noticeInsert">
		<button>insert</button><br>
	</form>
	
					
	
	<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    
    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
    <li class="page-item"><a class="page-link" href="./noticeList?curPage=${i}">${i}</a></li>
	</c:forEach>
	
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</nav>
	


</body>
</html>