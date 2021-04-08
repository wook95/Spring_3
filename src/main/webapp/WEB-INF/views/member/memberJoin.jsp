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


<div class="container mt-2">
		<h2 class="mt-4">Member Join Page</h2>

		<form action="./memberJoin" method="post" id="frm" enctype="multipart/form-data">
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control"	id="id" name="id">
				<h6 id="idResult"></h6>
				<!-- ID 는 6글자 이상 -->
				
				
			</div>
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password"	class="form-control" id="pw" name="pw">
				<h6 id="pwResult"></h6>
				<!-- PW는 8글자 이상 -->
			</div>
			<div class="form-group">
				<label for="pw">Confirm the password</label>
				<input type="password"class="form-control" id="pw2" name="pw">
				<h6 id="pw2Result"></h6>	
					
				<!-- PW 두개는 일치 -->	
			</div>			
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control"	id="name" name="name">
				<!-- 비어 있으면 X -->
			</div>	
			
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="text" class="form-control"	id="email" name="email">
				<!-- 비어 있으면 X -->
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="text" class="form-control"	id="phone" name="phone">
				<!-- 비어 있으면 X -->
			</div>
			
			
			
			
				<div class="form-group">
				<label for="avatar">Phone</label> 
				<input type="file" class="form-control etc"	id="avatar" name="avatar">
			</div>	
			
			
			
					
			<input type="submit" id="btn" value="JOIN" class="btn btn-primary">
		</form>
	</div>
		
		
<!-- id6글자 이상, pw 두개는 일치, name은 비어있음 안돼! 이메일, 폰 비어있음 안돼 --alert로 알려줄수있게 -->

	<!--  <script type="text/javascript" src="../resources/js/memberJoin.js"></script>
-->
</body>
</html>