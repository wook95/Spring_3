<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<c:import url="./template/bootStrap.jsp"></c:import>
<title>Hello, world!</title>
</head>
<body>


	<c:import url="./template/header.jsp"></c:import>



	<h1>Home world!</h1>

	<a href="./account/accountList">accountList</a>
	<br>



	<c:if test="${empty member }">
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
	 /notice/noticeList	   -- noticeList.jsp
	 /notice/noticeSeleect -- noticeSelect.jsp
	 /notice/notieInsert   -- noticeInsert.jsp
	 			(post)	   -- 글리스트로 이동
	 /notice/noticeUpdate  -- noticeUpdate.jsp
	 					   -- 글리스트로 이동
	 /notice/noticeDelete  -- 글리스트로 이동

  -->



</body>
</html>