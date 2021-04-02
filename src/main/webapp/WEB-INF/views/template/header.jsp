<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

</head>


<body>

	<div class="container">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<!-- Brand -->
			<a class="navbar-brand" href="${pageContext.request.contextPath}/">Home</a>

			<!-- Links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/account/accountList">Product</a></li>

				<c:if test="${empty member}">
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/member/memberLogin">Log-in</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/member/memberJoinCheck">Join</a></li>
				</c:if>

				<c:if test="${not empty member}">
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/member/memberPage">Member
							Page</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/member/memberLogout">Log-out</a></li>
				</c:if>


				<!-- Dropdown -->
				<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-bs-toggle="dropdown"> board </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="${pageContext.request.contextPath}/notice/noticeList">notice</a>
						<a class="dropdown-item" href="#">Link 2</a>
						<a class="dropdown-item" href="#">Link 3</a>
					</div></li>
			</ul>
		</nav>
	</div>


</body>
</html>