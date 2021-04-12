<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
<style type="text/css">
#sample {
display: none;
}
</style>

</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<h1>insert page</h1>


	<div class="container">
		<h2>${board}form</h2>
		<form action="./${board}Insert" method="post" id="frm"
			enctype="multipart/form-data">
			<div class="form-group">
				<label for="writer">Writer:</label> <input type="text"
					readonly="readonly" value="${member.id}" class="form-control"
					id="writer" name="writer">
			</div>
			<div class="form-group">
				<label for="title">Title:</label> <input type="text"
					class="form-control myCheck" id="title" name="title">
			</div>

			<div class="form-group">
				<label for="contents">Contents:</label>
				<textarea class="form-control myCheck" rows="5" id="contents"
					name="contents"></textarea>
			</div>

			<input type="button" id="add" value="ADD"
				class="btn btn-info myCheck">
				
			<div id="files" title="0"></div>


			<input type="button" id="btn" value="WRITE"
				class="btn btn-primary myCheck">
		</form>
	</div>

	<div id="sample">
		
			<div class="input-group">
				<div class="custom-file">
					<input type="file" class="form-control-file border" id="inputGroupFile04"
						name=files> 
				</div>
				<div class="input-group-append delete">
					<input class="btn btn-outline-secondary" id="inputGroupFileAddon04"
						type="button" value="DELETE">
				</div>
			</div>
		
	</div>

	<script type="text/javascript" src="../resources/jquery/fileAdd.js"></script>

	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>


</body>
</html>