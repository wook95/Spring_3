<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>


</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<h1>member join check page</h1>


		
		<button class="btn btn-danger" id="btn" onclick="check()">Join</button>
		<div></div>
	<div class="form-check-inline">
		<label class="form-check-label"> <input type="checkbox"
			class="form-check-input" value="" id="all">전체동의
		</label>
	</div>

	<div>

		<div class="form-check-inline">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input agreeBox1" value="1">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>1번 약관 </h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>

		<div class="form-check-inline">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input agreeBox1" value="2">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>2번 약관 </h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>

		<div class="form-check-inline">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input agreeBox1" value="3" >동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>3번 약관 </h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>

		<div class="form-check-inline">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input agreeBox1" value="4">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>4번 약관 </h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>



		<script type="text/javascript"
			src="../resources/jquery/memberJoinCheck.js"></script>
		
		
		
	</div>
	
	
</body>
</html>