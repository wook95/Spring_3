<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>account List page</title>
</head>
<body>

	<h1> account List page</h1>
	
	
		
		<table>
		
			<thead>	
				<tr>			
					<th>name</th>
					<th>rate</th>
					<th>sale</th>
				</tr> 	
			</thead>
		
			<tbody>
			<c:forEach items="${list }" vat="dto">
				<tr>
					<td> ${dto.accountName}</td>
					<td>${dto.rate }</td>
					<td>${dto.accountSale }</td>
				</tr>
			</c:forEach>	
				
			</tbody>
		

		
		</table>
		
	
	
	
</body>
</html>