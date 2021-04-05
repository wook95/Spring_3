<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>
<style>
  table, th, td {
    border: 1px solid #bcbcbc;
  }
  table {
    width: 600px;
    height: 70px;
  }
</style>
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

	<h1>${board} select</h1>
	
	<table>
	
	<thead>
	  <tr>
      <th scope="col">#</th>
      <th scope="col">title</th>
      <th scope="col">writer</th>
      <th scope="col">regDate</th>
      <th scope="col">hit</th>
    </tr>
	</thead>
	
	<tbody>
	<tr>
		<td>${dto.num}</td>
		<td>${dto.title}</td>
        <td>${dto.writer}</td>
        <td>${dto.regDate}</td>
        <td>${dto.hit}</td>
	</tr>
	</tbody>
	
	
	</table>
	
	<h3>${dto.contents}</h3>
	
	
	
	
	<a href="./${board}Update?num=${dto.num}" class="btn btn-danger">Update</a>
	<a href="./${board}Delete?num=${dto.num}" class="btn btn-info">Delete</a>
	
	
	
	<c:if test="${board ne 'notice'}">
	<a href="./${board}Reply?num=${dto.num}" class="btn btn-primary" >Reply</a>
	</c:if>
	
	
	
</body>
</html>