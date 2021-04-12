<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../template/bootStrap.jsp"></c:import>
<style type="text/css">
	#sample{
		display: none;
	}

</style>


</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	<h1>${board} update page</h1>


	<form action="./${board}Update" method="post" enctype="multipart/form-data">

		<input type="hidden" name="num" value="${dto.num}"> title<input
			type="text" name="title" value="${dto.title}"> contents<input
			type="text" name="contents" value="${dto.contents}">


		<c:forEach items="${dto.boardFiles}" var="file">


			<div>
				<span>${file.originName}</span> <span class="fileDelete"
					title="${file.fileNum}"> X </span>
			</div>



		</c:forEach>



		<input type="button" id="add" value="ADD" class="btn btn-info myCheck">
		<div id="files" title="${dto.boardFiles.size()}"></div>




<input type="submit" id="btn" value="UPDATE" class="btn btn-primary">
	</form>


	<div id="sample">

		<div class="input-group">
			<div class="custom-file">
				<input type="file" class="form-control-file border"
					id="inputGroupFile04" name=files>
			</div>
			<div class="input-group-append delete">
				<input class="btn btn-outline-secondary" id="inputGroupFileAddon04"
					type="button" value="DELETE">
			</div>
		</div>

	</div>



	<script type="text/javascript" src="../resources/jquery/boardUpdate.js"></script>
	<script type="text/javascript" src="../resources/jquery/fileAdd.js"></script>

</body>
</html>