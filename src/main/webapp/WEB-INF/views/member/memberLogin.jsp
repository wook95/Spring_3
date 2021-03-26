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
	<h1>login</h1>
	<div class="container">
		<div class="dropdown-menu">
			<form class="px-4 py-3" action="./memberLogin" method="post">
				<div class="mb-3">
					<label for="id" class="form-label">Email address</label> <input
						type="text" class="form-control" id="id" name = "id"
						placeholder="email@example.com">
				</div>
				<div class="mb-3">
					<label for="pw" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="pw" name="pw" placeholder="Password">
				</div>
				<div class="mb-3">
					<div class="form-check">
						<input type="checkbox" class="form-check-input" id="dropdownCheck">
						<label class="form-check-label" for="dropdownCheck">
							Remember me </label>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Sign in</button>
			</form>
		</div>
	</div>





	<form action="memberLogin" method="post">

		id<input type="text" name="id"> <br> pw<input
			type="password" name="pw"> <br>
		<button>log in</button>
	</form>








	<%-- 	<h3> id : ${dto.id}</h3>	<br>
	<h3> pw : ${dto.pw}</h3>	<br>
	<h3> name :${dto.name}</h3>	<br>
	<h3> phone :${dto.phone}</h3>	<br>
	<h3> email :${dto.email}</h3>	<br> --%>




</body>
</html>