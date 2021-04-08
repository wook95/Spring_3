<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> member PAge</h1>


<h3> id = ${member.id}</h3>
<h3> pw = ${member.pw}</h3>
<h3> name = ${member.name}</h3>
<h3> email = ${member.email}</h3>
<h3> phone = ${member.phone}</h3>
<h3> <img src="../resources/upload/member/${member.memberFileDTO.fileName}">	</h3>


<a href="./memberUpdate">정보수정</a>
<a href="./memberDelete">탈퇴</a>
<a href="../privateAccount/privateAccountList">계좌관리</a>

</body>
</html>