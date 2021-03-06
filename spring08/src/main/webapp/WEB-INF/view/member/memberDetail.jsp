<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 정보</title>
</head>
<body>
	<p>번호 : ${member.num}</p>
	<p>아이디 : ${member.id}</p>
	<p>이메일 : ${member.email}</p>
	<p>이름 : ${member.name}</p>
	<p>가입일 : <fmt:formatDate value="${member.regdate}" pattern="yyyy-MM-dd:HH"/>
	</p>
</body>
</html>