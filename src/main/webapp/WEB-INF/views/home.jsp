<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" href="./resources/css/test.css">
<!-- Bootstrap CSS -->
<c:import url="./template/bootStrap.jsp"></c:import>

<script type="text/javascript">

</script>

<title>Hello, world!</title>
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<div id=ddd1></div>
	<button onclick="go()">button</button>
	<button id ="btn">click</button>
	<button id ="btn2">click2</button>
	
	<h1>v1</h1>











	<script type="text/javascript">
	
	let btn = document.getElementById("btn");
	let btn2 = document.getElementById("btn2");
	
	
	btn2.addEventListener("click",function(){
		
		alert("btn2");
		go();
		
	})
	
	
	btn.onclick = function(){
		alert("나는야 익명 ㅎ,, 함수,, 이름이 없지,,")
		go();
	}
	
	
	function go(){
		
		alert("hello");
		
	}
	
	</script>










<%-- 	<c:if test="${empty member }">
		<a href="./member/memberJoin">Join</a>
		<br>
		<a href="./member/memberLogin">Login</a>
		<br>
	</c:if>


	<c:if test="${not empty member }">
		<h3>${member.id}님 환영합니다.</h3>
		<a href="./member/memberPage">Mypage</a>
		<br>
		<a href="./member/memberLogout">Logout</a>
		<br>
	</c:if>

 --%>

<!--

	기능 
	글리스트 - 모두 접근가능
	상세보기 - 모두 접근 가능 글리스트에서 제목을 클릭
	글 수정 - 관리자만 접근(공지사항)
	글 삭제 - ''
	글 작성 - ''

back-end
	noticeMapper
		-com.arc.s3.notice
	
	NoticeDTO
	NoticeDAO
		-getList : want to see list
		-getSelect : specification
		-setInsert : write
		-setUpdate : alter
		-setDelete : remove
		-setHitUpdate : increase views (when you select)
	NoticeService
		- dao와 동일, hit와 select 동시 호출
	NoticeController
		- 메서드 같이같다.
		- insert, update need two methods

front-end
	- / WEB-INF/views/notice

	 글 리스트
	 /notice/noticeList	   -- noticeLists.jsp
	 /notice/noticeSeleect -- noticeSelect.jsp
	 /notice/notieInsert   -- noticeInsert.jsp
	 			(post)	   -- 글리스트로 이동
	 /notice/noticeUpdate  -- noticeUpdate.jsp
	 					   -- 글리스트로 이동
	 /notice/noticeDelete  -- 글리스트로 이동

  -->

<script type="text/javascript" src="./resources/js/test.js"></script>

</body>
</html>