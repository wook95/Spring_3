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
	
	
<nav aria-label="Page navigation example">
  <ul class="pagination">
  
	<c:if test="${pager.pre}"> 
    <li class="page-item"><a class="page-link" href="./accountList?curPage=${pager.startNum-1}">Previous</a></li>
	</c:if>
    
   <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
    <li class="page-item"><a class="page-link" href="./accountList?curPage=${i}">${i}</a></li>
   </c:forEach> 
   
   <c:if test="${pager.next}">
    <li class="page-item"><a class="page-link" href="./accountList?curPage=${pager.lastNum+1}">Next</a></li>
    </c:if>
    
  </ul>
  
  <div class="input-group mt-3 mb-3">
  
<form action="./accountList" class="form-inline">

  <div class="input-group-prepend">
   <select class="form-control" id="sel1" name="kind">
    <option>Title</option>
    <option>Contents</option>
    <option>Writer</option>
  </select>
  </div>
  
  <input type="text" class="form-control" name="search" placeholder="Username">
    <div class="input-group-append">
    <button class="btn btn-success" type="submit">Search</button>
  </div>
 </form> 
</div>
</nav>


</body>
</html>