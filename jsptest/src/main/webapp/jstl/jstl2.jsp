<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.6.1.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<!-- url생성 -->
<<!--  c:url var="mypage" value="http://localhost:8081/jsptest/jstl/loginage.jsp"/>
<!-- include/forward 1.url최초요청jsp불변 2.같은서버 같은어플리케이션 파일 가능-->
<c:url var="mypage" value="http://www.google.com"/>
<c:redirect url="${mypage }">
	<c:param name="name" value="홍길동"/>
	<c:param name="age" value="21"/>
</c:redirect>
<!-- jsp:include -->
<c:import url="${mypage }">
	<c:param name="name" value="홍길동"/>
	<c:param name="age" value="21"/>
</c:import>
</body>
</html>