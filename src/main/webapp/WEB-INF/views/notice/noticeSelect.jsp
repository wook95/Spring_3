<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>select page</h1>
	
	<table>
	
	<thead>
	  <tr>
      <th scope="col">#</th>
      <th scope="col">title</th>
      <th scope="col">writer</th>
      <th scope="col">regDate</th>
      <th scope="col">hit</th>
    </tr>
	</thead>
	
	<tbody>
	<tr>
		<td>${dto.num}</td>
		<td>${dto.title}</td>
        <td>${dto.writer}</td>
        <td>${dto.regDate}</td>
        <td>${dto.hit}</td>
	</tr>
	</tbody>
	
	
	</table>
	
	<h3>${dto.contents}</h3>
	
	
		<form action="./noticeUpdate?num=${dto.num}">
		<button>Update</button>
	</form>
	
		<form action="./noticeDelete?num=${dto.num}">
		<button>Delete</button>
	</form>
	
	
	
	
	
</body>
</html>