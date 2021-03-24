<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> update page</h1>
	
		<form action="./accountUpdate" method="post">
	
			<input type="hidden" name=accountId value="${dto.accountId}" > <br>
			Name : <input type="text" name="accountName" value="${dto.accountName}"> <br>
			Rate : <input type="text" name="rate" value="${dto.rate}"> <br>
			Sale : <input type = text name="accountSale" value="${dto.accountSale }">
			
			<button>Update</button>
	
		</form>



</body>
</html>