<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>정보 수정 페이지</h1>
<form action="./memberUpdate" method="post">
	id<input type="text" readonly="readonly" name="id" value="${member.id}" > <br>
	pw<input type="text" name = "pw" value="${member.pw}"> <br>
	name<input type="text" name = "name" value="${member.name}"> <br>
	email<input type="text" name = "email" value="${member.email}"> <br>
	phone<input type="text" name = "phone" value="${member.phone}">

	<button>정보수정</button>
</form>


</body>
</html>