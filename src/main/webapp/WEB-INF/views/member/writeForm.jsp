<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="<c:url value="/resources/js/jquery-3.7.1.min.js"/>"></script>
	<script src="<c:url value="/resources/js/common.js"/>"></script>
</head>
<body>
	<div class="wrapper">
	<form name="mform" id="mform" method="post" action="process" autocomplete="off">
	<input type="text" name="memId" id="memId" value="${memberVo.memId}" placeholder="회사메일 아이디">
	<input type="text" name="memNm" id="memNm" value="${memberVo.memNm}" placeholder="실명 입력">
	<div class="btnWrap">
		<button type="submit" id="joinBtn" class="btnJoin">가입하기</button>
	</div>
	</form>
	</div>
    
</body>
</html>