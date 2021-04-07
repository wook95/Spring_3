<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>


</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<h1> ${board} page</h1>


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
					<td><a href="./${board}Select?num=${dto.num}">
					
					<c:catch>
					<c:forEach begin="1" end="${dto.depth}"> -- </c:forEach>
					</c:catch>
					
					
					${dto.title}</a></td>
					<td>${dto.writer}</td>
					<td>${dto.regDate}</td>
					<td>${dto.hit}</td>
					<td>${dto.contents}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



	<nav aria-label="Page navigation example">
		<ul class="pagination">
			<c:if test="${pager.pre}">
				<li class="page-item"><a class="page-link p" title="${pager.startNum-1}"
					href="#">Previous</a></li>
			</c:if>
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item"><a class="page-link p"
					href="#" title="${i}">${i}</a></li>
					
					<%-- ./noticeList?curPage=${i}&kind=${pager.kind}&search=${pager.search} --%>
			</c:forEach>

			<c:if test="${pager.next}">
				<li class="page-item"><a class="page-link p" title="${pager.lastNum+1}"
					href="#">Next</a></li>
			</c:if>
		</ul>

		<div id = "frm" class="input-group mt-3 mb-3">
			<form action="./${board}List" class="form-inline">
				<div class="input-group-prepend">
					<input type = "hidden" name="curPage" value="1" id="curPage">
					<select class="form-control" id="kind" name="kind">
						<option class="sel">Title</option>
						<option class="sel">Contents</option>
						<option class="sel">Writer</option>
					</select>
				</div>
				<input type="text" class="form-control" name="search" id="search" value="${pager.search}" placeholder="Username">
				<div class="input-group-append">
					<button class="btn btn-success" type="submit">Search</button>
				</div>
			</form>
		</div>
		
		
		<a href="./${board}Insert"><button type="button" class="btn btn-primary">write</button></a>
	</nav>


	<script type="text/javascript">
	
		let kind = '${pager.kind}';
		$(".sel").each(function(){
			
			let t = $(this).text();
			if(t == kind){
				
				$(this).prop("selected",true);
				
			}
			
		})
		
		
	$(".p").click(function(){
	
		
		let curPage = $(this).attr("title")
		//location.href = "./${board}List?curPage=" + curPage + "&kind=${pager.kind}&search=${pager.search}"
		
		let search = '${pager.search}';
		$("#curPage").val(curPage);
		
		
		
		
		
	/* 	$("#curPage").val(curPage);
		$("#kind").val(kind);
		$("#search").val(search);
		$("#frm").submit; */
	
	
	});
	
	
	
	
	</script>


</body>
</html>