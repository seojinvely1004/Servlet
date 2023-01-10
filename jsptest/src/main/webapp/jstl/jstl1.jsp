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
<!-- set태그는 브라우저에 아무것도 보여주는 것이 없다. -->
<%String jspname = "홍길동"; %> <!-- jsp로 변수선언 -->
<c:set var="id" value="jstl"/>
<c:set var="pw" value="1111"/>
<c:set var="name" value="<%=jspname %>"/> <!-- 변수에 저장할 값을 자바의 변수 jsp로줌 -->
<c:set var="result" value="${pw + 100 }"/> <!--el변수에 연산저장도할수있다 -->
<!-- 모든출력은 el태그작성. -->
<h1>${id }</h1>
<h1>${pw }</h1>
<h1>${name }</h1>
<h1>${result }</h1>
</body>
</html>