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
	
	<div>
	<c:forEach items="${dto.boardFiles}" var="file">
		<a href="../resources/upload/${board}/${file.fileName}">${file.originName}</a>
	
	</c:forEach>
	</div>
	
	
	<!-- 댓글 리스트 -->
	<div id = "comments" title="${dto.num}">
	
	
	</div>
	
	<div>
		<div class="form-group">
  		<label	 for="usr">Name:</label>
  		<input type="text" class="form-control" id="writer">
		</div>
	
		<div class="form-group">
  		<label for="comments">Comment:</label>
  		<textarea class="form-control" rows="5" id="contents"></textarea>
		</div>
		
		 <button type="button" class="btn btn-success" id="writeButton">Write</button>
	</div>
	
	
	
	<a href="./${board}Update?num=${dto.num}" class="btn btn-danger">Update</a>
	<a href="#" id="del" class="btn btn-info">Delete</a>

	
	
	
	<c:if test="${board ne 'notice'}">
	<a href="./${board}Reply?num=${dto.num}" class="btn btn-primary" >Reply</a>
	</c:if>
	
	
	<form action="./${board}Delete" id="frm">
		<input type = "hidden" name="num" value="${dto.num}">
	</form>
	
	
	
	
	<script src="../resources/jquery/comments.js" type="text/javascript"></script>
	<script type="text/javascript">
	
	const frm = document.getElementById("frm");
	const del = document.getElementById("del");
	del.addEventListener("click",function(){
		
		
		let result = confirm("delete?");
		
		if(result = true){
		//location.href="./${board}Delete?num=${dto.num}"
			//frm.method="post"
			frm.setAttribute("method","post");
			frm.submit();
				
		}
		
	})
	
	</script>
	
</body>
</html>